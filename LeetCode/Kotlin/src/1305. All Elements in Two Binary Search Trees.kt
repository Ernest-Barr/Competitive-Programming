import DataStructure.TreeNode

private fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    fun dfs(node: TreeNode?) {
        if (node == null) return

        dfs(node.left)
        res.add(node.`val`)
        dfs(node.right)
    }

    dfs(root1)
    dfs(root2)

    res.sort()

    return res
}
