fun pivotIndex(nums: IntArray): Int {

    var right = 0
    var left = 0

    for (num in nums) right += num

    for (i in nums.indices) {
        if (left == right - nums[i]) return i
        right -= nums[i]
        left += nums[i]
    }

    return -1
}