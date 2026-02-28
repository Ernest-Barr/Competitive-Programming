import DataStructure.TreeNode

fun diameterOfBinaryTree(root: TreeNode?): Int {
    var res = 0

    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0
        val l = dfs(root.left)
        val r = dfs(root.right)

        res = maxOf(res, l + r)

        return 1 + maxOf(l, r)
    }

    dfs(root)
    return res
}