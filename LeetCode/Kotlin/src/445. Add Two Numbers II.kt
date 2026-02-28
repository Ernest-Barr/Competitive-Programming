import DataStructure.ListNode
import java.util.Stack

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val st1: Stack<Int> = Stack()
    val st2: Stack<Int> = Stack()

    fun populate(l: ListNode?, st: Stack<Int>) {
        if (l == null) return
        st.push(l.`val`)
        populate(l.next, st)
    }

    populate(l1, st1)
    populate(l2, st2)

    var res: ListNode? = ListNode(0)

    var sum = 0

    while (st1.isNotEmpty() || st2.isNotEmpty()) {
        if (st1.isNotEmpty()) sum += st1.pop()
        if (st2.isNotEmpty()) sum += st2.pop()

        res!!.`val` = sum % 10
        sum /= 10

        val fst = ListNode(sum)
        fst.next = res
        res = fst
    }

    return if (res!!.`val` == 0) res.next else res
}