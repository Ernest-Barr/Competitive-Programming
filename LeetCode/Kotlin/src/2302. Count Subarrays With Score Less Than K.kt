private fun countSubarrays(nums: IntArray, k: Long): Long {
    var l = 0
    var res: Long = 0
    var sum: Long = 0

    for (r in nums.indices) {
        sum += nums[r]
        while (sum * (r - l + 1) >= k) {
            sum -= nums[l++]
        }

        if (sum * (r - l + 1) < k) res += (r - l + 1)
    }

    return res
}

fun main() {
    println(countSubarrays(intArrayOf(2, 1, 4, 3, 5), 10) == 6L)
    println(countSubarrays(intArrayOf(1, 1, 1), 5) == 5L)
}