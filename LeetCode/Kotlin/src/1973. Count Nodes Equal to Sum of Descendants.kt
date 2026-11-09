import DataStructure.TreeNode

private fun equalToDescendants(root: TreeNode?): Int {
    var res = 0

    fun dfs(node: TreeNode?): Int {
        if (node == null) return 0

        val sum = dfs(node.left) + dfs(node.right)

        if (node.`val` == sum) res++

        return sum + node.`val`
    }

    dfs(root)

    return res
}
