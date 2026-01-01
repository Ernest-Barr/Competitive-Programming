import DataStructure.TreeNode

private fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    fun dfs(node: TreeNode?): TreeNode? {
        return when {
            node == null -> null
            `val` > node.`val` -> dfs(node.right)
            `val` < node.`val` -> dfs(node.left)
            else -> node
        }
    }

    return dfs(root)
}