private class Node(var key: Int, var value: Int) {
    var next: Node? = null
}

private class MyHashMap() {
    val list: Array<Node?> = Array(1000) { null }
    private fun hash(key: Int): Int = key % 1000

    fun put(key: Int, value: Int) {
        val index: Int = hash(key)
        var current: Node? = list[index]

        while (current != null) {
            if (current.key == key) {
                current.value = value
                return
            }
            current = current?.next
        }

        val head: Node = Node(key, value)
        head.next = list[index]
        list[index] = head
    }

    fun get(key: Int): Int {
        val index: Int = hash(key)
        var current: Node? = list[index]

        while (current != null) {
            if (current.key == key) return current.value
            current = current?.next
        }

        return -1
    }

    fun remove(key: Int) {
        val index: Int = hash(key)
        var current: Node? = list[index]
        var prev: Node? = null

        while (current != null) {
            if (current.key == key) {
                if (prev == null) list[index] = current.next
                else prev.next = current.next
            }
            prev = current
            current = current?.next
        }
    }
}