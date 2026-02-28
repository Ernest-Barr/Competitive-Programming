private fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val n = image.size
    val m = image[0].size
    val startColor = image[sr][sc]

    if (startColor == color) return image

    fun visit(i: Int, j: Int) {
        if (i !in 0..<n || j !in 0..<m || image[i][j] != startColor) return

        image[i][j] = color
        visit(i + 1, j)
        visit(i - 1, j)
        visit(i, j + 1)
        visit(i, j - 1)
    }

    visit(sr, sc)
    return image
}