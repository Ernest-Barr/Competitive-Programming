package util

import DataStructure.ListNode


fun ListNode?.printList() {
    var node = this
    while (node != null) {
        if (node.next != null) print("$node, ") else println(node)
        node = node.next
    }
}

/**
 * Iterates through both lists and determines if they are equal
 */
fun ListNode?.equalsList(other: ListNode?): Boolean {
    var self: ListNode? = this
    var o: ListNode? = other

    while (self != null && o != null) {
        if (self.`val` != o.`val`) return false

        self = self.next
        o = o.next
    }

    return true
}

/**
 * Converts array to linked list
 */
fun IntArray.toLinkedList(): ListNode? {
    if (this.isEmpty()) return null

    var current: ListNode? = ListNode(this[0])
    val dummy = ListNode(0)
    dummy.next = current

    for (i in 1..<this.size) {
        current?.next = ListNode(this[i])
        current = current?.next
    }
    return dummy.next
}
