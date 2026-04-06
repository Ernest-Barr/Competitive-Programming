import DataStructure.TreeNode

fun convertBST(root: TreeNode?): TreeNode? {
    // RNL traversal, add nodes as popping off call stack
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
