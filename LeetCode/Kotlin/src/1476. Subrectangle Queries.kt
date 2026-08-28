private class SubrectangleQueries(val rectangle: Array<IntArray>) {
    private val updates: MutableList<List<Int>> = mutableListOf()

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        updates.add(listOf(row1, col1, row2, col2, newValue))
    }

    fun getValue(row: Int, col: Int): Int {

        for ((row1, col1, row2, col2, value) in updates.reversed()) {
            if (row in row1..row2 && col in col1..col2) {
                return value
            }
        }

        return rectangle[row][col]
    }

}
