private fun divideArray(nums: IntArray): Boolean {
    val arr = IntArray(501)

    for (num in nums) arr[num]++
    for (num in arr) if (num % 2 != 0) return false

    return true
}

fun main() {
    println(divideArray(intArrayOf(3, 2, 3, 2, 2, 2)))
    println(divideArray(intArrayOf(1, 2, 3, 4)))
}