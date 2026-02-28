private fun sortColors(nums: IntArray): Unit {
    var redCount = 0 // 0
    var whiteCount = 0 // 1
    var blueCount = 0 // 2

    for (num in nums) {
        when (num) {
            0 -> redCount++
            1 -> whiteCount++
            2 -> blueCount++
        }
    }

    for (i in nums.indices) {
        if (redCount != 0) {
            nums[i] = 0
            redCount--
        } else if (whiteCount != 0) {
            nums[i] = 1
            whiteCount--
        } else {
            nums[i] = 2
            blueCount--
        }
    }
}

fun main() {
    var colors = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(colors)
    println(colors.joinToString(", "))

    colors = intArrayOf(2, 0, 1)
    sortColors(colors)
    println(colors.joinToString(", "))
}