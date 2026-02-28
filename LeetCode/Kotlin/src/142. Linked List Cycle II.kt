import DataStructure.ListNode

private fun detectCycle(head: ListNode?): ListNode? {
    var current: ListNode? = head

    val map: MutableMap<ListNode?, Int> = mutableMapOf()
    var i = 0
    while (current != null) {
        if (current in map) return current else map[current] = i++
        current = current.next
    }

    return null
}

fun main() {

    val cycle = ListNode(3)
    cycle.next = ListNode(2)
    cycle.next!!.next = ListNode(0)
    cycle.next!!.next!!.next = ListNode(-4)
    cycle.next!!.next!!.next!!.next = cycle.next
    println("Cycle at Value " + detectCycle(cycle))

    val cycleTwo = ListNode(0)
    cycleTwo.next = ListNode(1)
    cycleTwo.next!!.next = cycleTwo
    println("Cycle at Value " + detectCycle(cycleTwo))
}