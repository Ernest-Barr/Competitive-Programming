private fun generate(numRows: Int): List<List<Int>> {
    if (numRows == 0) return listOf()
    if (numRows == 1) return listOf(listOf(1))

    val res: MutableList<MutableList<Int>> = mutableListOf()
    var prev: MutableList<Int> = MutableList(1) { 1 }

    for (i in 1..numRows) {
        val new: MutableList<Int> = MutableList(i) { 1 }

        for (j in 1..<prev.size) {
            new[j] = prev[j - 1] + prev[j]
        }

        res.add(new)
        prev = new
    }

    return res
}