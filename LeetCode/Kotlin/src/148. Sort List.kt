import DataStructure.ListNode

fun sortList(head: ListNode?): ListNode? {

    fun mergeList(l1: ListNode?, l2: ListNode?): ListNode? {

        var res: ListNode? = ListNode(0)
        val c = res
        var left = l1
        var right = l2

        while (left != null && right != null) {
            if (left.`val` < right.`val`) {
                res?.next = left
                left = left.next
            } else {
                res?.next = right
                right = right.next
            }
            res = res?.next
        }

        if (left != null) {
            res?.next = left
        }

        if (right != null) {
            res?.next = right
        }

        return c?.next
    }

    if (head == null) return null
    if (head?.next == null) return head

    var slow = head
    var fast = head?.next

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next!!.next
    }

    val mid = slow?.next
    slow?.next = null

    val l = sortList(head)
    val r = sortList(mid)

    return mergeList(l, r)
}