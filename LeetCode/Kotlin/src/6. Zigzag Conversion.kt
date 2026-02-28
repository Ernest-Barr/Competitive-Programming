private fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val arr: List<MutableList<Char>> = List(numRows) { mutableListOf() }
    val res = StringBuilder()

    var dir = 1
    var i = 0

    for (c in s) {
        arr[i].add(c)
        when (i) {
            0 -> dir = 1
            numRows - 1 -> dir = -1
        }
        i += dir
    }

    for (r in arr) for (c in r) res.append(c)

    return res.toString()
}