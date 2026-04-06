interface ImmutableListNode {
    fun getNext(): ImmutableListNode?

    fun printValue()
}

fun printLinkedListInReverse(head: ImmutableListNode?) {
    if (head == null) return

    printLinkedListInReverse(head.getNext())
    head.printValue()
}
