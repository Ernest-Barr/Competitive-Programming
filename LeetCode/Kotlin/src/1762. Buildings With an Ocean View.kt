fun findBuildings(heights: IntArray): IntArray {
    val n = heights.size
    val res: MutableList<Int> = mutableListOf()
    var curr = 0

    for (i in heights.indices.reversed()) {
        if (heights[i] > curr) {
            res.add(i)
            curr = heights[i]
        }
    }

    return res.reversed().toIntArray()
}
