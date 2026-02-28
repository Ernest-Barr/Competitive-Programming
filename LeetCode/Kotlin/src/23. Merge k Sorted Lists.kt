import DataStructure.ListNode
import java.util.*

fun mergeKListsBF(lists: Array<ListNode?>): ListNode? {

    if (lists.size == 1) return lists[0]

    var res: ListNode? = null
    // var copy: ListNode? = res

    fun merge(list1: ListNode?, list2: ListNode?): ListNode? {
        var merged: ListNode? = ListNode(0)
        val c: ListNode? = merged
        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {

            if (l1.`val` <= l2.`val`) {
                merged?.next = l1
                l1 = l1?.next
            } else {
                merged?.next = l2
                l2 = l2?.next
            }

            merged = merged?.next
        }

        if (l1 == null) {
            merged?.next = l2
        } else {
            merged?.next = l1
        }

        return c?.next
    }

    for (list in lists) {
        // if (list == null) continue
        res = merge(res, list)
    }

    return res
}

fun mergeKListsHeap(lists: Array<ListNode?>): ListNode? {
    val queue = PriorityQueue<ListNode>(compareBy{it.`val`})

    val tail = ListNode(0) // Tail end of result list
    val res = tail // Pointer to head

    for (list in lists) queue.offer(list)

    while (queue.isNotEmpty()) {
        var curr = queue.poll()

        tail.next = curr
        curr = curr?.next

        if (curr != null) queue.offer(curr)
    }

    return res.next
}