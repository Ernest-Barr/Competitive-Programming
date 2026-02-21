fun digitCount(num: String): Boolean {
    val map: IntArray = IntArray(10) { 0 }

    for (c in num) map[c.code - '0'.code]++

    for (i in num.indices) if ((num[i].code - '0'.code) != map[i]) return false

    return true
}