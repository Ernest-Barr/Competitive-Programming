fun isMonotonic(nums: IntArray): Boolean {
    if (nums.size < 2) return true
    val increasing = nums[0] <= nums[nums.size - 1]


    for (i in 0..<nums.size - 1) {
        if (increasing) {
            if (nums[i] > nums[i + 1]) return false
        } else {
            if (nums[i] < nums[i + 1]) return false
        }
    }

    return true
}