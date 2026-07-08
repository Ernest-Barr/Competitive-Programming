import DataStructure.ListNode

private fun mergeNodes(head: ListNode?): ListNode? {
    var curr = head

    while (curr != null) {
        if (curr.`val` == 0) {
            var ptr = curr.next
            var sum = 0

            while (ptr != null && ptr.`val` != 0) {
                sum += ptr.`val`
                ptr = ptr.next
            }

            curr.`val` = sum
            curr.next = if (ptr?.next == null) null else ptr
        }

        curr = curr.next
    }

    return head
}
