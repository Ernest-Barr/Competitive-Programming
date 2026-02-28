private fun toLowerCase(s: String): String {
    val res = StringBuilder(s)

    for (c in res.indices) {
        val ch = res[c]
        if (ch.code >= 'A'.code && ch.code <= 'Z'.code) {
            res.setCharAt(c, (ch.code + 32).toChar())
        }
    }

    return res.toString()
}