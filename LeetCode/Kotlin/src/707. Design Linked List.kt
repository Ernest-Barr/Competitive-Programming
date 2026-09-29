private class MyLinkedList() {

    class ListNode(var value: Int) {
        var prev: ListNode? = null
        var next: ListNode? = null

        override fun toString(): String = "$value, "
    }

    var head: ListNode? = null
    var tail: ListNode? = head
    var size = 0

    fun get(index: Int): Int {
        if (index !in 0..<size) return -1

        var curr: ListNode? = head
        for (i in 0..<index) curr = curr?.next

        return curr!!.value
    }

    fun addAtHead(`val`: Int) {
        val node: ListNode = ListNode(`val`)

        when (size) {
            0 -> {
                head = node
                tail = head
            }

            else -> {
                head!!.prev = node
                node!!.next = head
                head = node
            }
        }

        size++
    }

    fun addAtTail(`val`: Int) {
        val node: ListNode = ListNode(`val`)

        when (size) {
            0 -> {
                tail = node
                head = tail
            }

            else -> {
                tail!!.next = node
                node.prev = tail
                tail = node
            }
        }

        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        when (index) {
            !in 0..size -> return
            size -> addAtTail(`val`)
            0 -> addAtHead(`val`)
            else -> {
                val node: ListNode = ListNode(`val`)
                var curr = head
                for (i in 0..<index) curr = curr!!.next

                node.prev = curr!!.prev
                node.next = curr
                curr.prev!!.next = node
                curr.prev = node

                size++
            }
        }
    }

    fun deleteAtIndex(index: Int) {
        when (index) {
            !in 0..<size -> return
            0 -> {
                head = head!!.next
                head?.prev = null
            }
            size - 1 -> {
                tail = tail!!.prev
                tail?.next = null
            }
            else -> {
                var curr = head

                for (i in 0..<index) curr = curr!!.next

                curr!!.prev!!.next = curr.next
                curr.next!!.prev = curr.prev
            }
        }

        size--
    }

}
