private fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
    val map: MutableMap<Int, MutableSet<Int>> = mutableMapOf()
    val res: IntArray = IntArray(k) { 0 }

    for ((id, time) in logs) {
        if (id !in map) map[id] = mutableSetOf()

        map[id]!!.add(time)
    }

    // for ((time, set) in map) {
    //     for (id in set) {
    //         uam[id] = (uam[id] ?: 0) + 1
    //     }
    // }

    for ((id, times) in map) res[times.size - 1]++

    return res
}
