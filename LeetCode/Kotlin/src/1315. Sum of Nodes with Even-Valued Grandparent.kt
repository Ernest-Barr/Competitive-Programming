import DataStructure.TreeNode

private fun sumEvenGrandparent(root: TreeNode?): Int {
    var res = 0

    fun dfs (node: TreeNode?, parent: TreeNode?, grandParent: TreeNode?) {
        if (node == null) return

        dfs(node.left, node, parent)
        dfs(node.right, node, parent)

        if (grandParent != null && grandParent.`val` and 1 == 0) res += node.`val`
    }

    dfs(root, null, null)

    return res
}
