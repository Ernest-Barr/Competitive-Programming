private fun highFive(items: Array<IntArray>): Array<IntArray> {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for ((id, score) in items) {
        if (id !in map) map[id] = mutableListOf()

        map[id]!!.add(score)
    }

    val res: MutableList<IntArray> = mutableListOf()


    for ((id, score) in map) res.add(intArrayOf(id, score.sorted().takeLast(5).sum() / 5))

    return res.sortedBy { it[0] }.toTypedArray()
}
