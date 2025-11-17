import DataStructure.TreeNode


//TODO: Optimize
fun longestZigZag(root: TreeNode?): Int {
    if (root?.left == null && root?.right == null) return 0

    fun dfs(node: TreeNode?, left: Boolean, num: Int): Int {
        if (node == null) return 0

        return maxOf(num,
            when (left) {
                true -> maxOf(dfs(node.left, true, 1), dfs(node.right, false, num + 1))
                false -> maxOf(dfs(node.right, false, 1), dfs(node.left, true, num + 1))
            }
        )
    }

    return maxOf(dfs(root.left, true, 1), dfs(root.right, false, 1))
}