class ZigzagIterator {
    val queue: ArrayDeque<Int> = ArrayDeque()

    constructor(v1: IntArray, v2: IntArray) {
        var i = 0
        var j = 0

        while (i < v1.size || j < v2.size) {
            if (i < v1.size) queue.add(v1[i++])
            if (j < v2.size) queue.add(v2[j++])
        }
    }

    fun next(): Int {
        return queue.removeFirst()
    }

    fun hasNext(): Boolean {
        return queue.isNotEmpty()
    }
}