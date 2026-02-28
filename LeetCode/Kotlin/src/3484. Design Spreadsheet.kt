private class Spreadsheet(rows: Int) {

    val map: MutableMap<String, Int> = mutableMapOf()

    fun setCell(cell: String, value: Int) {
        map[cell] = value
    }

    fun resetCell(cell: String) {
        map[cell] = 0
    }

    fun getValue(formula: String): Int {
        val split = formula.substring(1).split("+")
        var sum = 0

        sum += if (split[0][0].isLetter()) (if (split[0] in map) map[split[0]]!! else 0) else split[0].toInt()
        sum += if (split[1][0].isLetter()) (if (split[1] in map) map[split[1]]!! else 0) else split[1].toInt()

        return sum
    }

}