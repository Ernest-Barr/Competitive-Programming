import DataStructure.ListNode
import util.equalsList
import util.toLinkedList

//TODO: Rewrite
private fun addTwoNumbersBF(l1: ListNode?, l2: ListNode?): ListNode? {
    // Kotlin params are immutable
    var res: ListNode? = l1 //Ideally swap the name of this variable with the name of l1Copy
    var l2Copy: ListNode? = l2
    // Pointer to beginning of linked list so we odnt lose it when returning the value
    val l1Copy: ListNode? = res

    // Iterate through list
    while (l2Copy != null && res != null) {
        if (res.next == null && l2Copy!!.next != null) {
            res.next = ListNode(0)
        }
        if (res.`val` + l2Copy.`val` < 10) {
            res.`val` += l2Copy.`val`
        } else {
            if (res.next == null) {
                res.next = ListNode(1)
            } else {
                res.next!!.`val`++
            }
            res.`val` = (res.`val` + l2Copy.`val`) % 10
        }

        res = res.next
        l2Copy = l2Copy.next
    }

    while (res != null) {
        if (res.`val` < 10) {
            res = res.next
        } else {
            if (res.next == null) {
                res.next = ListNode(1)
            } else {
                res.next!!.`val`++
            }
            res.`val` %= 10
            res = res.next
        }
    }

    return l1Copy
}