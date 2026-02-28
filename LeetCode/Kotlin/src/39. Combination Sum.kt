fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val res: MutableList<MutableList<Int>> = mutableListOf()

    fun backtrack(i: Int, combination: MutableList<Int>, currSum: Int) {
        if (currSum == target) {
            res.add(combination.toMutableList())
            return
        }

        if (i > candidates.size - 1 || currSum > target) return

        combination.add(candidates[i])
        backtrack(i, combination, currSum + candidates[i])
        combination.removeLast()
        backtrack(i + 1, combination, currSum)
    }

    backtrack(0, mutableListOf(), 0)
    return res
}