private fun permuteUnique(nums: IntArray): List<List<Int>> {
    val n = nums.size
    val res: MutableList<List<Int>> = mutableListOf()

    /**
    Frequency counting or a bool array is necessary for tracking states

    Identical elements will produce the same exact permutations so we can skip them and just consider the first instance.
    Initial order of elements does not matter in this case sinc we are looking to generate all permutations anyway

    If an element has been used => skip
    If an element is a duplicate and the first instance has been fully evaluated => skip
     */

    nums.sort()

    fun dfs(curr: MutableList<Int>, used: BooleanArray) {
        if (curr.size == n) {
            res.add(curr.toList())
            return
        }

        for (i in 0..<n) {
            when {
                used[i] -> continue
                i - 1 >= 0 && nums[i - 1] == nums[i] && !used[i - 1] -> continue
            }
            // if (!used[i]) {
            used[i] = true
            curr.add(nums[i])
            dfs(curr, used)
            curr.removeLast()
            used[i] = false
            // }
        }
    }

    dfs(mutableListOf(), BooleanArray(n) { false })

    return res
}
