
//TODO: redo this atrocity from 11/07/24
fun myAtoi(s: String): Int {
    var str = s.trim()
    var num: Long = 0
    var neg: Boolean = false

    if (str.isEmpty()) {
        return 0
    } else if (str[0] == '-') {
        neg = true
        str = str.substring(1)
    } else if (str[0] == '+') {
        str = str.substring(1)
    }

    for (i in str.indices) {
        if (str[i].isDigit()) {
            num *= 10
            num += str[i].digitToInt()
            if (neg && -num <= Int.MIN_VALUE) {
                return Int.MIN_VALUE
            } else if (num > Int.MAX_VALUE) {
                return Int.MAX_VALUE
            }
        } else {
            break
        }
    }

    return if (neg) -num.toInt() else num.toInt()
}