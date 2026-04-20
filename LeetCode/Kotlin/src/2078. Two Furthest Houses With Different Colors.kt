private fun maxDistance(colors: IntArray): Int {
    var res = 0
    val n = colors.size

    for (i in 0..<n) {
        if (colors[i] != colors[0]) res = maxOf(res, i)
        if (colors[i] != colors[n - 1]) res = maxOf(res, n - 1 - i)
    }

    return res
}
