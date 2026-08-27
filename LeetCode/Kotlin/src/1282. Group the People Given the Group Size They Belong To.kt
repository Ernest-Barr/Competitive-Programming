private fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for ((i, size) in groupSizes.withIndex()) {
        if (size !in map) map[size] = mutableListOf()

        map[size]!!.add(i)
    }

    for ((size, list) in map) res += list.chunked(size)

    return res
}
