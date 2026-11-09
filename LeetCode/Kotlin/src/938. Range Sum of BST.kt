import DataStructure.TreeNode

private fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    var res = 0

    fun dfs(node: TreeNode?) {
        if (node == null) return
        if (node.`val` > low) dfs(node.left)
        if (node.`val` in low..high) res += node.`val`
        if (node.`val` < high) dfs(node.right)
    }

    dfs(root)

    return res
}
