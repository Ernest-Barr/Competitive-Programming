fun binaryGap(n: Int): Int {
    var res = 0

    var num = n
    var count = -1

    for (i in 0..<32) {
        if (num and 1 == 1) {
            if (count != -1) res = maxOf(res, i - count)
            count = i
        }

        num = num shr 1
    }

    return res
}