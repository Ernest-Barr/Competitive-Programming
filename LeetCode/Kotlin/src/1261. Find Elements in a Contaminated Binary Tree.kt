import DataStructure.TreeNode
import java.util.Stack

private class FindElements(root: TreeNode?) {
    val nums: MutableSet<Int> = mutableSetOf()

    init {
        var cur = root
        cur!!.`val` = 0

        val stack: Stack<TreeNode> = Stack()
        stack.push(cur)

        while (stack.isNotEmpty()) {
            val u = stack.pop()
            nums.add(u.`val`)

            if (u.left != null) {
                u.left!!.`val` = 2 * u.`val` + 1
                stack.push(u.left)
            }

            if (u.right != null) {
                u.right!!.`val` = 2 * u.`val` + 2
                stack.push(u.right)
            }
        }
    }

    fun find(target: Int): Boolean {
        return target in nums
    }

}
