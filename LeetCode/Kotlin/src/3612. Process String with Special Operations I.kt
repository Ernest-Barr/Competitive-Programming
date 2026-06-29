private fun processStr(s: String): String {
    var res = ""

    for (c in s) {
        when (c) {
            '*' -> if (res.length != 0) res = res.substring(0, res.length - 1)
            '#' -> res += res
            '%' -> res = res.reversed()
            else -> res += c

        }
    }

    return res
}
