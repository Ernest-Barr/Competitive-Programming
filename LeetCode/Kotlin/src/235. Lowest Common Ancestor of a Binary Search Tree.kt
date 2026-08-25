import DataStructure.TreeNode

private fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    fun dfs(node: TreeNode?): TreeNode? {
        return when {
            node == null -> null
            p!!.`val` > node!!.`val` && q!!.`val` > node!!.`val` -> dfs(node.right)
            p!!.`val` < node!!.`val` && q!!.`val` < node!!.`val` -> dfs(node.left)
            else -> node
        }
    }

    return dfs(root)
}
