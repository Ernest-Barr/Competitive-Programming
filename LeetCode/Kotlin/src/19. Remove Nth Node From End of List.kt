import DataStructure.ListNode
import util.equalsList
import util.toLinkedList


private fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val res = ListNode(0)
    res.next = head
    var current: ListNode? = res
    var delayed: ListNode? = res

    for (i in 0..<n + 1) {
        current = current?.next
    }

    while (current != null) {
        delayed = delayed?.next
        current = current.next
    }

    delayed?.next = delayed?.next?.next
    return res.next
}