import kotlin.math.abs

fun findClosestNumber(nums: IntArray): Int {
    var res = Int.MAX_VALUE
    var min = Int.MAX_VALUE

    for (num in nums) {
        if (abs(num) < min) {
            res = num
            min = abs(num)
        }

        if (abs(num) == min) res = maxOf(res, num)
    }
    return res
}

fun main() {
    println(findClosestNumber(intArrayOf(-4,-2,1,4,8)) == 1)
    println(findClosestNumber(intArrayOf(2,-1,1)) == 1)
    println(findClosestNumber(intArrayOf(-100000,-100000)) == -100000)
}