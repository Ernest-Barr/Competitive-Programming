import DataStructure.TreeNode

fun longestUnivaluePath(root: TreeNode?): Int {
    if (root == null) return 0

    var res = 0

    fun dfs(node: TreeNode?, prev: Int): Int {
        if (node == null) return 0

        val l = dfs(node.left, node.`val`)
        val r = dfs(node.right, node.`val`)

        res = maxOf(res, l + r)

        return if (node.`val` == prev) 1 + maxOf(l, r) else 0
    }

    dfs(root, root.`val`)

    return res
}