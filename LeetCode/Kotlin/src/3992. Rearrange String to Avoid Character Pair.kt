private fun rearrangeString(s: String, x: Char, y: Char): String {
    val str = s.toCharArray()

    if (x < y) str.sortDescending() else str.sort()

    return str.joinToString("")
}
