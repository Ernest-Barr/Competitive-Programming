private fun findNumbers(nums: IntArray): Int {
    var res = 0
    for (i in nums.indices) {
        var digits = 0
        while (nums[i] > 0) {
            nums[i] /= 10
            digits++
        }
        if (digits % 2 == 0) res++
    }
    return res
}

fun main() {
    println(findNumbers(intArrayOf(20, 25, 123, 1343, 1004, 1050, 899)) == 5)
    println(findNumbers(intArrayOf(1)) == 0)
    println(findNumbers(intArrayOf(123, 343, 456, 3893, 2342, 344)) == 2)
}