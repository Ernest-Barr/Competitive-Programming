private fun convertToTitle(columnNumber: Int): String {
    var res: String = ""
    var col: Int = columnNumber
    while (col > 0) {
        col--
        val remainder = col % 26
        res += "" + ('A' + remainder)
        col /= 26
    }

    var result = ""
    for (i in res.length - 1 downTo 0) {
        result += res[i]
    }

    return result
}


fun main() {
    println(convertToTitle(72))
    println(convertToTitle(27))
    println(convertToTitle(1))
    println(convertToTitle(150))
    println(convertToTitle(3000))
    println(convertToTitle(26))
}

