fun findRepeatedDnaSequences(s: String): List<String> {
    val map: MutableMap<String, Int> = mutableMapOf()
    val res: MutableList<String> = mutableListOf()
    val n = s.length

    for (i in 0..<n - 9) {
        val str = s.substring(i, i + 10)
        map[str] = if (str in map) map[str]!! + 1 else 1
    }

    for ((str, freq) in map) if (freq > 1) res.add(str)

    return res
}