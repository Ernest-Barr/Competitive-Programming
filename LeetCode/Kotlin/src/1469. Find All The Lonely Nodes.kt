import DataStructure.TreeNode

fun getLonelyNodes(root: TreeNode?): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    fun dfs(node: TreeNode?) {
        if (node == null) return

        dfs(node.left)

        when {
            node.left == null && node.right != null -> res.add(node.right!!.`val`)
            node.left != null && node.right == null -> res.add(node.left!!.`val`)
        }

        dfs(node.right)
    }

    dfs(root)

    return res
}
