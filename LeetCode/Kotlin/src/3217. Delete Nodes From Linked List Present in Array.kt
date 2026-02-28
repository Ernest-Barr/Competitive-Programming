import DataStructure.ListNode

private fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
    val set = nums.toSet()
    var cpy = head

    while (cpy != null && cpy.`val` in set) cpy = cpy.next

    val res = ListNode(0)
    res.next = cpy

    while (cpy != null) {
        while (cpy.next != null && cpy.next?.`val` in set) {
            cpy.next = cpy.next?.next
        }

        cpy = cpy.next
    }

    return res.next
}