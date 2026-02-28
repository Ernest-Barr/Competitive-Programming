import kotlin.math.abs

private fun threeSumClosest(nums: IntArray, target: Int): Int {
    var res: Int = 0
    var dist: Int = Int.MAX_VALUE
    nums.sort()
    for (i in 0..<nums.size - 2) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        var l = i + 1
        var r = nums.size - 1
        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]

            when {
                sum == target -> return sum
                abs(target - sum) < dist -> {
                    dist = abs(target - sum)
                    res = sum
                }
            }

            when {
                sum < target -> l++
                sum > target -> r--
            }
        }
    }

    return res
}