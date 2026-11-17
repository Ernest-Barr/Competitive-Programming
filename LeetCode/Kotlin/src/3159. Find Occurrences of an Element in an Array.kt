private fun occurrencesOfElement(nums: IntArray, queries: IntArray, x: Int): IntArray {
    val map: MutableList<Int> = mutableListOf()
    val k = queries.size
    val res: IntArray = IntArray(k) { 0 }

    for ((i, num) in nums.withIndex()) if (num == x) map.add(i)
    for ((i, query) in queries.withIndex()) res[i] = if (query > map.size) -1 else map[query - 1]

    return res
}
