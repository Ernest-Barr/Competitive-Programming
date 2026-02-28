private fun uniqueOccurrences(arr: IntArray): Boolean {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val set: MutableSet<Int> = mutableSetOf()

    for (num in arr) map[num] = if (num in map) map[num]!! + 1 else 1
    for (freq in map.values) if(!set.add(freq)) return false

    return true
}