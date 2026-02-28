import DataStructure.TreeNode

fun longestConsecutive(root: TreeNode?): Int {
    if (root == null) return 0

    fun dfs(node: TreeNode?, prev: Int, curr: Int): Int {
        if (node == null) return 0

        val len = when {
            node.`val` == prev + 1 -> curr + 1
            else -> 1
        }

        return maxOf(len, dfs(node.left, node.`val`, len), dfs(node.right, node.`val`, len))
    }

    return dfs(root, 0, 0)
}