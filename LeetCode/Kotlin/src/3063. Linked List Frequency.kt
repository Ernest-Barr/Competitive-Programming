private fun frequenciesOfElements(head: ListNode?): ListNode? {
    var tail = ListNode(0)
    val map: MutableMap<Int, ListNode?> = mutableMapOf()
    var curr = head

    while (curr != null) {
        if (curr.`val` !in map) {
            val node = ListNode(0)
            tail.next = node
            tail = node

            map[curr.`val`] = node
        }

        map[curr.`val`]!!.`val`++
        curr = curr.next
    }

    return map[head!!.`val`]
}
