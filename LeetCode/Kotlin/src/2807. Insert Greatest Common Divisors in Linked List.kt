import DataStructure.ListNode

private fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    fun gcd(a: Int, b: Int): Int = when (b) {
        0 -> a
        else -> gcd(b, a % b)
    }

    val res = head
    var curr = head
    var prev: ListNode? = null

    while (curr != null) {
        if (prev != null) {
            val node = ListNode(gcd(prev.`val`, curr.`val`))
            prev.next = node
            node.next = curr
        }

        prev = curr
        curr = curr.next
    }

    return res
}
