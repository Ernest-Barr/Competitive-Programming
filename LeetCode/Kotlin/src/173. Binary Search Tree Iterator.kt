import DataStructure.TreeNode
import java.util.Stack

class BSTIterator(
    var root: TreeNode?,
) {
    /*
        LNR Traversal

        Left should always be returned by next() first
        N should be returned second
        R should bre returned last
     */

    val stack: Stack<TreeNode> = Stack()

    init {
        push(root)
    }

    fun push(node: TreeNode?) {
        var cpy = node
        while (cpy != null) {
            stack.push(cpy)
            cpy = cpy.left
        }
    }

    fun next(): Int {
        val next = stack.pop()
        push(next.right)
        return next.`val`
    }

    fun hasNext(): Boolean = stack.isNotEmpty()
}
