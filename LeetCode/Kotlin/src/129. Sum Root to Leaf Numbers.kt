import DataStructure.TreeNode

private fun sumNumbers(root: TreeNode?): Int {
    var res = 0

    fun dfs(node: TreeNode?, curr: Int) {
        if (node == null) return

        val num = curr * 10 + node.`val`

        if (node.left == null && node.right == null) {
            res += num
            return
        }

        dfs(node.left, num)
        dfs(node.right, num)
    }

    dfs(root, 0)

    return res
}
