private fun moveZeroes(nums: IntArray): Unit {
    var j = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j++] = temp
        }
    }
}