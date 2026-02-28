import DataStructure.ListNode

private fun hasCycle(head: ListNode?): Boolean {
    var current = head
    var next = head

    while (next?.next != null) {
        current = current!!.next
        next = next.next?.next
        if (current == next) return true
    }
    return false
}

fun main() {
    val list = ListNode(0)
    list.next = ListNode(1)
    list.next!!.next = ListNode(2)
    list.next!!.next = ListNode(3)

    val cycle = ListNode(0)
    cycle.next = ListNode(1)
    cycle.next!!.next = ListNode(2)
    cycle.next!!.next = cycle

    println(hasCycle(list))
    println(hasCycle(cycle))
}
