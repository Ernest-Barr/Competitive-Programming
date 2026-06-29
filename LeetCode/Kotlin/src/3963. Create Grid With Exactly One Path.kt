private fun createGrid(m: Int, n: Int): Array<String> {
    val res: Array<String> = Array(m) { "." + "#".repeat(n - 1) }
    res[m - 1] = ".".repeat(n)

    return res
}
