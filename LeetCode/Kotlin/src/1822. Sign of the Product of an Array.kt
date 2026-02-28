fun arraySign(nums: IntArray): Int {
    var sign = 1

    for (num in nums) {
        when {
            num == 0 -> return 0
            num < 0 -> sign *= -1
        }
    }

    return sign
}