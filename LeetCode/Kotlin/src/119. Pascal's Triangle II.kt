private fun getRow(rowIndex: Int): List<Int> {
    var prev: MutableList<Int> = MutableList(1) { 1 }
    for (i in 1..rowIndex + 1) {
        val new: MutableList<Int> = MutableList(i) { 1 }

        for (j in 1..<prev.size) {
            new[j] = prev[j - 1] + prev[j]
        }

        prev = new
    }

    return prev
}