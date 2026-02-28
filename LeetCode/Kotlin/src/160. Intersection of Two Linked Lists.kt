import DataStructure.ListNode

private fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    val map: MutableSet<ListNode?> = mutableSetOf()
    var l1: ListNode? = headA
    var l2: ListNode? = headB

    while (l1 != null) {
        map.add(l1)
        l1 = l1.next
    }

    while (l2 != null) {
        if (l2 in map) return l2
        map.add(l2)
        l2 = l2.next
    }

    return null
}

fun main() {
    val intersect = ListNode(8)
    intersect.next = ListNode(4)
    intersect.next!!.next = ListNode(5)

    val listOne = ListNode(4)
    listOne.next = ListNode(1)
    listOne.next!!.next = intersect

    val listTwo = ListNode(5)
    listTwo.next = ListNode(6)
    listTwo.next!!.next = intersect

    println(getIntersectionNode(listOne, listTwo)?.`val`)
}