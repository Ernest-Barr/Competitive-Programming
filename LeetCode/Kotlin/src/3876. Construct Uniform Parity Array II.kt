private fun uniformArray(nums: IntArray): Boolean {
    /**
    Odd Number = 2k + 1
    Even = 2k

    If the array contains an odd value, then everything in the array must be odd including the minimum
    Otherwise, everything is even
     */

    val n = nums.size
    var even = true
    var min = Int.MAX_VALUE

    for (num in nums) {
        min = minOf(min, num)

        if (num % 2 == 1) even = false
    }

    return if (min % 2 == 1) true else even
}
