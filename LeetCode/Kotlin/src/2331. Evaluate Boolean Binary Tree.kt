import DataStructure.TreeNode

private fun evaluateTree(root: TreeNode?): Boolean {
    fun dfs(node: TreeNode?): Boolean {
        if (node?.left == null && node?.right == null) return when (node!!.`val`) {
            0 -> false
            else -> true
        }

        val left = dfs(node.left)
        val right = dfs(node.right)

        return when (node.`val`) {
            2 -> left || right
            else -> left && right
        }
    }

    return dfs(root)
}
