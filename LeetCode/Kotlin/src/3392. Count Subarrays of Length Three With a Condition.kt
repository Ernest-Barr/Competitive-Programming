private fun countSubarrays(nums: IntArray): Int {
    var res = 0
    for (i in 1..<nums.size - 1) {
        if ((nums[i - 1] + nums[i + 1]).toDouble() == (nums[i] / 2.0)) res++
    }

    return res
}

fun main() {
    println(countSubarrays(intArrayOf(1, 2, 1, 4, 1)) == 1)
    println(countSubarrays(intArrayOf(1, 1, 1)) == 0)
}