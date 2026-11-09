private fun findLonelyPixel(picture: Array<CharArray>): Int {
    val m = picture.size
    val n = picture[0].size

    val rows = IntArray(m) { 0 }
    val cols = IntArray(n) { 0 }

    var res = 0

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (picture[i][j] == 'B') {
                rows[i]++
                cols[j]++
            }
        }
    }

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (picture[i][j] == 'B' && rows[i] == 1 && cols[j] == 1) res++
        }
    }

    return res
}
