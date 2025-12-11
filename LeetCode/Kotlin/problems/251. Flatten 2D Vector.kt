private class Vector2D(vec: Array<IntArray>) {
    val list: MutableList<Int> = mutableListOf()

    init {
        for (i in vec.indices) {
            for (j in vec[i].indices) {
                list.add(vec[i][j])
            }
        }
    }

    fun next(): Int {
        return if (hasNext()) list.removeFirst() else -1
    }

    fun hasNext(): Boolean {
        return list.isNotEmpty()
    }

}