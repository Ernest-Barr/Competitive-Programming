import DataStructure.ListNode

private fun reverseList(head: ListNode?): ListNode? {
    var copy = head
    var next: ListNode?
    var res: ListNode? = null
    while (copy != null) {
        next = copy.next
        copy.next = res
        res = copy
        copy = next
    }
    return res
}

fun main() {
    val list = ListNode(1)
    list.next = ListNode(2)
    list.next!!.next = ListNode(3)
    list.next!!.next!!.next = ListNode(4)
    list.next!!.next!!.next!!.next = ListNode(5)
    var reversed = reverseList(list)

    while(reversed != null) {
        print(reversed)
        reversed = reversed.next
    }
}