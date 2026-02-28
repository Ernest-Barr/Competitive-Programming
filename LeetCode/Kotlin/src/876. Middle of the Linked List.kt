import DataStructure.ListNode
import util.printList


private fun middleNode(head: ListNode?): ListNode? {
    var slow: ListNode? = head
    var fast: ListNode? = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    return slow
}

fun main() {
    val listOne = ListNode(0)
    listOne.next = ListNode(1)
    listOne.next!!.next = ListNode(2)

    val listTwo = ListNode(3)
    listTwo.next = ListNode(5)
    listTwo.next!!.next = ListNode(6)
    listTwo.next!!.next!!.next = ListNode(9)
    listTwo.next!!.next!!.next!!.next = ListNode(10)

    val listThree = ListNode(1)
    listThree.next = ListNode(2)
    listThree.next!!.next = ListNode(3)
    listThree.next!!.next!!.next = ListNode(4)
    listThree.next!!.next!!.next!!.next = ListNode(5)
    listThree.next!!.next!!.next!!.next!!.next = ListNode(6)

    middleNode(listOne)?.printList()
    middleNode(listTwo)?.printList()
    middleNode(listThree)?.printList()
}