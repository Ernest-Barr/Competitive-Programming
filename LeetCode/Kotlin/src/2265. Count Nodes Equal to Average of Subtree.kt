import DataStructure.TreeNode

private fun averageOfSubtree(root: TreeNode?): Int {
    var res = 0

    fun dfs(node: TreeNode?): IntArray {
        if (node == null) return intArrayOf(0, 0)

        val left = dfs(node.left)
        val right = dfs(node.right)

        val sum = left[0] + right[0] + node.`val`
        val count = left[1] + right[1] + 1

        if (node.`val` == (sum / count)) res++

        return intArrayOf(sum, count)
    }

    dfs(root)

    return res
}
