import DataStructure.ListNode

private fun partition(head: ListNode?, x: Int): ListNode? {
    var partition: ListNode? = ListNode(0)
    val res: ListNode? = partition
    var larger: ListNode? = ListNode(0)
    val largerHead: ListNode? = larger

    var curr = head

    while (curr != null) {
        if (curr.`val` < x) {
            partition?.next = curr
            partition = partition?.next
        } else {
            larger?.next = ListNode(curr.`val`)
            larger = larger?.next
        }

        curr = curr.next
    }

    larger?.next = null
    partition?.next = largerHead?.next

    return res?.next
}