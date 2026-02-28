private fun majorityElement(nums: IntArray): Int {
    var c = 0
    var res = nums[0]
    for (num in nums) {
        if (c == 0) {
            res = num
            c = 1
        } else if (num == res) {
            c++
        } else {
            c--
        }
    }
    return res
}

fun main() {
    println(majorityElement(intArrayOf(1, 1, 1, 1, 1, 3, 4, 4, 45, 6, 67)) == 67) // No majority element
    println(majorityElement(intArrayOf(2, 2, 2, 2, 4, 4, 4, 4, 7, 8, 4)))
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    println(majorityElement(intArrayOf(1)))
    println(majorityElement(intArrayOf(3, 2, 3)))
}