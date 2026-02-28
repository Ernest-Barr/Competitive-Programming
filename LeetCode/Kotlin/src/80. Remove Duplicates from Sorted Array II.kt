private fun removeDuplicates(nums: IntArray): Int {
    return when (nums.size) {
        0 -> 0
        1 -> 1
        else -> {
            var i = 2
            for (j in 2..<nums.size) if (nums[i - 2] != nums[j]) nums[i++] = nums[j]

            return i
        }
    }
}