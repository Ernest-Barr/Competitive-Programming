private fun sumOfThree(num: Long): LongArray {
    // x - 1 + x + x + 1 = 3x
    // 3x = num
    // num/3 = x

    return when {
        num % 3L == 0L -> {
            val x = num / 3
            return longArrayOf(x - 1, x, x + 1)
        }

        else -> longArrayOf()
    }
}

