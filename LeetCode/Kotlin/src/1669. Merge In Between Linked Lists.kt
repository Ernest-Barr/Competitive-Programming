import DataStructure.ListNode

private fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
    var i = 0
    var curr: ListNode? = list1
    var start: ListNode? = null
    var end: ListNode? = null

    while (curr != null) {
        if (i == a - 1) start = curr
        if (i == b + 1) {
            end = curr
            break
        }

        i++
        curr = curr.next
    }

    curr = list2

    while (curr?.next != null) {
        curr = curr.next
    }

    start?.next = list2
    curr?.next = end

    return list1
}
