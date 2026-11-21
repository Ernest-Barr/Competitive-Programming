private fun isStrobogrammatic(num: String): Boolean {
    val map: Map<Char, Char> = mapOf(
        '0' to '0',
        '1' to '1',
        '8' to '8',
        '6' to '9',
        '9' to '6'
    )

    val res = StringBuilder()

    for (d in num) {
        if (d !in map) return false

        res.append(map[d]!!)
    }

    return res.toString().reversed() == num
}
