fun confusingNumber(n: Int): Boolean {
    val map = mapOf(
        0 to 0,
        1 to 1,
        6 to 9,
        8 to 8,
        9 to 6
    )

    var cpy = n
    var num = 0

    while (cpy != 0) {
        val digit = cpy % 10

        if (digit !in map) return false

        num *= 10
        num += map[digit]!!
        cpy /= 10
    }

    return num != n
}
