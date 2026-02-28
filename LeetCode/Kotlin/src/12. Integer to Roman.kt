private fun intToRoman(num: Int): String {
    var res: String = ""

    val vals: Array<Int> = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val chars: Array<String> = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    var i: Int = 0
    var temp: Int = num
    while (i < vals.size) {
        if (temp - vals[i] < 0) {
            i++
            continue
        } else {
            temp -= vals[i]
            res += chars[i]
        }

        if (temp == 0) break
    }
    return res
}