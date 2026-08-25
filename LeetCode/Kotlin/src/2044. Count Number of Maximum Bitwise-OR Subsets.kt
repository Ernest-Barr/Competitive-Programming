private fun countMaxOrSubsets(nums: IntArray): Int {
    var res = 0
    val subsets: MutableList<List<Int>> = mutableListOf()
    val curr: MutableList<Int> = mutableListOf()

    //2 ^ 16 possible subsets = 65k
    // Need some way of enumerating the subsets to yield the largest possible bitwise or

    fun backtrack(i: Int) {
        if (i == nums.size) {
            subsets.add(curr.toList())
            return
        }

        backtrack(i + 1)
        curr.add(nums[i])
        backtrack(i + 1)
        curr.removeLast()
    }

    backtrack(0)

    var max = 0

    for (num in nums) max = max or num

    for (subset in subsets) {
        var c = 0

        for (num in subset) c = c or num

        if (c == max) res++
    }

    return res
}
