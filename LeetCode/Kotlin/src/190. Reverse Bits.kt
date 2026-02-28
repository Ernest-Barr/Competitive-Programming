fun reverseBits(n: Int): Int {
    var res = 0
    var num = n
    for (i in 0..<32) {
        res = (res shl 1) or (num and 1)
        num = num shr 1
    }

    return res
}