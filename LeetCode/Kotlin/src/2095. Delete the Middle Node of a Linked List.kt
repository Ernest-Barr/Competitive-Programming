import DataStructure.ListNode
import util.equalsList
import util.toLinkedList

private fun deleteMiddle(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var slow: ListNode? = head
    var fast: ListNode? = head

    while (fast?.next != null) {
        prev = slow
        slow = slow?.next
        fast = fast.next?.next
    }

    if (prev?.next != null) {
        prev.next = prev.next?.next
    } else {
        return null
    }

    return head
}

fun main() {
    println(
        deleteMiddle(intArrayOf(1, 3, 4, 7, 1, 2, 6).toLinkedList()).equalsList(
            intArrayOf(1, 3, 4, 1, 2, 6).toLinkedList()
        )
    )
    println(deleteMiddle(intArrayOf(1, 2, 3, 4).toLinkedList()).equalsList(intArrayOf(1, 2, 4).toLinkedList()))
    println(deleteMiddle(intArrayOf(2, 1).toLinkedList()).equalsList(intArrayOf(2).toLinkedList()))
}