fun findMatrix(nums: IntArray): List<List<Int>> {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var n = 0

    for (num in nums) {
        map[num] = if (num in map) map[num]!! + 1 else 1
        n = maxOf(n, map[num]!!)
    }

    val res: List<MutableList<Int>> = List(n) { mutableListOf() }

    for ((u, v) in map) {
        var i = 0
        var cpy = v
        while (cpy-- > 0) res[i++].add(u)
    }

    return res
}