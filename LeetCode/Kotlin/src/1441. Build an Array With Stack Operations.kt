private fun buildArray(target: IntArray, n: Int): List<String> {
    val set = target.toSet()
    val res: MutableList<String> = mutableListOf()
    var j = 0


    for (i in 1..n) {
        if (j == target.size) break

        res.add("Push")

        if (i !in set) {
            res.add("Pop")
            continue
        }

        j++
    }

    return res
}
