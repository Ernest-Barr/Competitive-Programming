private fun triangleType(nums: IntArray): String {
    nums.sort()
    if (nums[0] + nums[1] <= nums[2]) return "none"
    return when (nums.toSet().size) {
        1 -> "equilateral"
        2 -> "isosceles"
        else -> "scalene"
    }
}

fun main() {
    println(triangleType(intArrayOf(3, 3, 3)) == "equilateral")
    println(triangleType(intArrayOf(3, 4, 5)) == "scalene")
    println(triangleType(intArrayOf(8, 4, 2)) == "none")
    println(triangleType(intArrayOf(5, 3, 8)) == "none")
}