private class MyHashSet() {
    val list: List<MutableList<Int>> = List(10000) { mutableListOf() }

    private fun hash(key: Int): Int = key % 1000

    fun add(key: Int) {
        val index = hash(key)
        if (key !in list[index]) list[index].add(key)
    }

    fun remove(key: Int) {
        val index: Int = hash(key)
        if (key in list[index]) list[index].remove(key)
    }

    fun contains(key: Int): Boolean {
        return key in list[hash(key)]
    }
}