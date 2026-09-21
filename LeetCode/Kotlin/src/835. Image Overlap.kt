private fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
    val n = img1.size
    val imgOne: MutableList<List<Int>> = mutableListOf()
    val imgTwo: MutableList<List<Int>> = mutableListOf()
    val map: MutableMap<List<Int>, Int> = mutableMapOf()
    var res = 0

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (img1[i][j] == 1) imgOne.add(listOf(i , j))
            if (img2[i][j] == 1) imgTwo.add(listOf(i, j))
        }
    }

    for ((x1, y1) in imgOne) {
        for ((x2, y2) in imgTwo) {
            val delta = listOf(x2 - x1, y2 - y1)
            map[delta] = (map[delta] ?: 0) + 1
            res = maxOf(res, map[delta]!!)
        }
    }

    return res
}
