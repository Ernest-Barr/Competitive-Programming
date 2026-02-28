import DataStructure.ListNode

private fun deleteDuplicates(head: ListNode?): ListNode? {
    val res: ListNode? = head
    var current: ListNode? = head

    while (current?.next != null) {
        if (current.`val` == current.next?.`val`) {
            current.next = current.next?.next
        } else {
            current = current.next
        }
    }
    return res
}

fun main() {
    val listOne = ListNode(0)
    listOne.next = ListNode(0)
    listOne.next!!.next = ListNode(0)

    var listOneRes = deleteDuplicates(listOne)
    println("List One: ")
    while (listOneRes != null) {
        println(listOneRes.`val`)
        listOneRes = listOneRes.next
    }
    println()

    println("List Two:")
    val listTwo = ListNode(1)
    listTwo.next = ListNode(2)
    listTwo.next!!.next = ListNode(3)
    listTwo.next!!.next!!.next = ListNode(3)
    listTwo.next!!.next!!.next = ListNode(4)
    var listTwoRes = deleteDuplicates(listTwo)

    while (listTwoRes != null) {
        println(listTwoRes.`val`)
        listTwoRes = listTwoRes.next
    }

    println()

    println("List Three:")
    val listThree = ListNode(1)
    listThree.next = ListNode(2)
    listThree.next!!.next = ListNode(2)
    listThree.next!!.next!!.next = ListNode(3)
    listThree.next!!.next!!.next = ListNode(3)
    var listThreeRes = deleteDuplicates(listThree)

    while (listThreeRes != null) {
        println(listThreeRes.`val`)
        listThreeRes = listThreeRes.next
    }

}