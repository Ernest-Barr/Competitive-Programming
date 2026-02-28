private fun countSubarrays(nums: IntArray, k: Int): Long {
    var count = 0
    var l = 0
    var res: Long = 0
    val max = nums.max()

    for (element in nums) {
        if (element == max) count++
        while (count >= k) if (nums[l++] == max) count--
        res += l
    }

    return res
}

fun main() {
    println(countSubarrays(intArrayOf(1, 3, 2, 3, 3), 2) == 6L)
    println(countSubarrays(intArrayOf(1, 4, 2, 1), 3) == 0L)
}