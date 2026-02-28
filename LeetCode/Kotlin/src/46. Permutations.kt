private fun permute(nums: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    fun backtrack(i: Int, set: MutableList<Int>) {
        if (i == nums.size) {
            res.add(set.toList())
            return
        }

        for (num in nums.indices) {
            if (nums[num] in set) continue
            set.add(nums[num])
            backtrack(i + 1, set)
            set.removeLast()
        }
    }

    backtrack(0, mutableListOf())
    return res
}