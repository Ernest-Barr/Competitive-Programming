private fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map: HashMap<String, MutableList<String>> = hashMapOf()
    for (i in strs.indices) {
        val table = IntArray(26)

        for (c in strs[i]) {
            table[c.code - 97]++
        }

        var key = ""

        for (j in table.indices) {
            if (table[j] != 0) {
                key += ((j + 97).toChar()).toString().repeat(table[j])
            }
        }

        if (map.containsKey(key)) {
            val list = map.getValue(key)
            list.add(strs[i])
            map[key] = list
        } else {
            map[key] = mutableListOf(strs[i])
        }
    }
    return map.values.toList()
}