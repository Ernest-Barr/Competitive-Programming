import DataStructure.ListNode

private fun oddEvenList(head: ListNode?): ListNode? {
    // prev odd
    // prev even
    // curr

    var i = 1
    var prevOdd: ListNode? = null
    var prevEven: ListNode? = null
    var curr = head
    val evenHead: ListNode? = head?.next

    while (curr != null) {
        when (i++ % 2) {
            1 -> {
                prevOdd?.next = curr
                prevOdd = curr
            }

            0 -> {
                prevEven?.next = curr
                prevEven = curr
            }
        }

        curr = curr.next
    }

    prevEven?.next = null
    prevOdd?.next = evenHead

    return head
}