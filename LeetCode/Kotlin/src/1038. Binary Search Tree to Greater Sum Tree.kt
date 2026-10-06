import DataStructure.TreeNode

private fun bstToGst(root: TreeNode?): TreeNode? {
    var sum = 0

    fun dfs(node: TreeNode?) {
        if (node == null) return

        dfs(node.right)

        sum += node.`val`
        node.`val` = sum

        dfs(node.left)
    }

    dfs(root)

    return root
}
