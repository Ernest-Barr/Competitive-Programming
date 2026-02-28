import DataStructure.ListNode

private fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val res: ListNode? = ListNode(0)
    res?.next = head
    var current = res

    while (current != null) {
        while (current?.next?.`val` == `val`) {
            current?.next = current?.next?.next
        }
        current = current?.next
    }

    return res?.next
}