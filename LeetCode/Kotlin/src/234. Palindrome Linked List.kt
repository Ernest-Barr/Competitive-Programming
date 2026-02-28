import DataStructure.ListNode

private fun isPalindrome(head: ListNode?): Boolean {
    var curr = head
    val stack: ArrayDeque<Int> = ArrayDeque()


    while(curr != null) {
        stack.addLast(curr.`val`)
        curr = curr.next
    }

    curr = head

    while (curr != null) {
        if (curr.`val` != stack.last()) return false
        curr = curr.next
        stack.removeLast()
    }

    return true
}