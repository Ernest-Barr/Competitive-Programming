import DataStructure.ListNode

private fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
    var prev: ListNode? = null
    var curr: ListNode? = head

    var first = -1
    var prevIdx = -1
    var currIdx = -1
    var c = 0
    var min = Int.MAX_VALUE

    fun isValid(prev_val: Int, curr_val: Int, next_val: Int): Boolean = (curr_val > prev_val && curr_val > next_val) || (curr_val < prev_val && curr_val < next_val)

    while (curr != null) {
        if (curr.next != null && prev != null && isValid(prev.`val`, curr.`val`, curr.next!!.`val`)) {
            if (first == -1) {
                first = c
                currIdx = c
            } else {
                prevIdx = currIdx
                currIdx = c

                min = minOf(min, currIdx - prevIdx)
            }
        }

        prev = curr
        curr = curr?.next
        c++
    }

    return if (first != currIdx) intArrayOf(min, currIdx - first)  else intArrayOf(-1, -1)
}
