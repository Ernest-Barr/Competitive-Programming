private fun largestPerimeter(nums: IntArray): Int {
    nums.sort()

    for (i in nums.size - 1 downTo 0) {
        for (j in i downTo 2) {
            if (nums[j - 1] + nums[j - 2] > nums[i]) return nums[i] + nums[j - 1] + nums[j - 2]
        }
    }

    return 0
}