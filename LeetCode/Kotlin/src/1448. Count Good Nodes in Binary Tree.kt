import DataStructure.TreeNode

fun goodNodes(root: TreeNode?): Int {
    if (root == null) return 0
    var res = 0

    fun dfs(node: TreeNode?, curr: Int) {
        if (node == null) return

        if (node.`val` >= curr) res++
        val max = maxOf(node.`val`, curr)

        dfs(node.left, max)
        dfs(node.right, max)
    }

    dfs(root, root.`val`)

    return res
}