import DataStructure.TreeNode

private fun isUnivalTree(root: TreeNode?): Boolean {
    val value = root!!.`val`

    fun dfs(node: TreeNode?): Boolean {
        return node == null || node.`val` == value && dfs(node.left) && dfs(node.right)
    }

    return dfs(root)
}
