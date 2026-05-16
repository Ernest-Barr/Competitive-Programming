private fun heightChecker(heights: IntArray): Int {
    val expected = heights.sorted()
    var res = 0

    for (i in heights.indices) if (heights[i] != expected[i]) res++

    return res
}
