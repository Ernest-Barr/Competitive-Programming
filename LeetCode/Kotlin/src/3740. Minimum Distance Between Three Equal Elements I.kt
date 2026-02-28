import kotlin.math.abs

private fun minimumDistance(nums: IntArray): Int {
    var res = Int.MAX_VALUE

    for (i in nums.indices) {
        var j = i + 1
        var k = nums.size - 1

        while (j < k) {
            if (nums[i] == nums[j] && nums[j] == nums[k]) {
                res = minOf(res, abs(i - j) + abs(j - k) + abs(k - i))
                if (j - i > k - i) j++ else k--
            }

            if (nums[j] != nums[i]) j++
            if (nums[k] != nums[i]) k--
        }
    }

    return if (res == Int.MAX_VALUE) -1 else res
}
