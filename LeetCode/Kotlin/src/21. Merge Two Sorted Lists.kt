import DataStructure.ListNode

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    // Mutable List
    var l1 = list1
    var l2 = list2

    var res: ListNode? = ListNode(0) // Result List
    val copy = res // Pointer to head of result list

    // Iterate until one list is empty
    while (l1 != null && l2 != null) {
        // Perform insertions
        if (l1.`val` > l2.`val`) {
            res?.next = l2
            l2 = l2.next
            res = res?.next
        } else {
            res?.next = l1
            l1 = l1.next
            res = res?.next
        }
    }

    // Remainder of list gets added to end of res
    if (l1 != null) {
        res?.next = l1
    } else {
        res?.next = l2
    }

    return copy?.next
}