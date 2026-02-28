fun maxSubArray(nums: IntArray): Int {
    var res = nums[0]
    var max = nums[0]

    for (i in 1..<nums.size) {
        max = maxOf(max + nums[i], nums[i])
        res = maxOf(res, max)
    }

    return res
}

fun main() {
    var arr = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    println(maxSubArray(arr) == 6)
    arr = intArrayOf(1)
    println(maxSubArray(arr) == 1)
    arr = intArrayOf(5, 4, -1, 7, 8)
    println(maxSubArray(arr) == 23)
}