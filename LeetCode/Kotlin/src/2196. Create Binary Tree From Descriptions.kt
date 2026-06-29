import DataStructure.TreeNode
import java.util.Stack

private fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
    val map: MutableMap<Int, MutableList<Pair<Int, Boolean>>> = mutableMapOf()
    val nums: MutableSet<Int> = mutableSetOf()
    val children: MutableSet<Int> = mutableSetOf()

    for ((parent, child, isLeft) in descriptions) {
        if (parent !in map) map[parent] = mutableListOf()
        map[parent]!!.add(Pair(child, if (isLeft == 1) true else false))
        children.add(child)
        nums.add(parent)
        nums.add(child)
    }

    val root: TreeNode = TreeNode((nums - children).first())
    val stack: Stack<TreeNode> = Stack()

    stack.add(root)

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        for (v in map[u.`val`]!!) {
            val node = TreeNode(v.first)
            if (v.second) u.left = node else u.right = node
        }

        if (u.left != null && u.left!!.`val` in map) stack.add(u.left)
        if (u.right != null && u.right!!.`val` in map) stack.add(u.right)
    }

    return root
}
