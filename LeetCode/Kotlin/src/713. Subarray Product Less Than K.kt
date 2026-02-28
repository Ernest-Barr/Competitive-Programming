private fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    var res = 0
    var l = 0
    var product = 1

    for (r in nums.indices) {
        product *= nums[r]
        while (l < r && product >= k) product /= nums[l++]
        if (product < k) res += (r - l) + 1
    }

    return res
}

fun main() {
    println(numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100) == 8)
    println(numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0) == 0)
}