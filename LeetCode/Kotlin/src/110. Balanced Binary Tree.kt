import DataStructure.TreeNode
import kotlin.math.abs

private fun isBalanced(root: TreeNode?): Boolean {
    if (root == null) return true

    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + maxOf(dfs(root.left), dfs(root.right))
    }

    val l = dfs(root.left)
    val r = dfs(root.right)

    return abs(l - r) <= 1 && isBalanced(root.left) && isBalanced(root.right)
}