import DataStructure.TreeNode
import java.util.*

private fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return listOf()
    val res: MutableList<MutableList<Int>> = mutableListOf()
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    var level = 0
    queue.push(root)
    while (queue.isNotEmpty()) {
        if (res.size <= level) res.add(mutableListOf())
        val n = queue.size

        for (i in 0..<n) {
            val node = queue.removeFirst()
            if (node != null) res[level].add(node.`val`)
            if (node.left != null) queue.addLast(node.left)
            if (node.right != null) queue.addLast(node.right)
        }
        level++
    }
    return res
}