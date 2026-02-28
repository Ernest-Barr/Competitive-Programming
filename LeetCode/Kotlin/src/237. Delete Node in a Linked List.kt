import DataStructure.ListNode

private fun deleteNode(node: ListNode?) {
    node!!.`val` = node?.next!!.`val`
    node?.next = node?.next?.next
}

// No main method for this problem, see #83 or #2095 instead. 