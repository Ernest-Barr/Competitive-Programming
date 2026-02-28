import DataStructure.ListNode
import java.util.Stack

fun pairSum(head: ListNode?): Int {
    val st: Stack<Int> = Stack()
    var n = 0

    fun populate(node: ListNode?, stack: Stack<Int>) {
        if (node == null) return
        stack.push(node.`val`)
        n++
        populate(node.next, stack)
    }

    populate(head, st)

    fun solve(i: Int, sum: Int, node: ListNode?): Int = when {
        i == n / 2 -> sum
        else -> solve(i + 1,maxOf(sum, node!!.`val` + st.pop()), node.next)
    }

    return solve(0, 0, head)
}