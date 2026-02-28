import DataStructure.TreeNode

private fun pathSum(root: TreeNode?, targetSum: Int): Int {
    var res = 0

    val target = targetSum.toLong()

    fun dfs(node: TreeNode?) {
        if (node == null) return

        fun inner(local: TreeNode?, curr: Long) {
            if (local == null) return

            val sum = curr + local.`val`

            if (sum == target) res++

            inner(local.left, sum)
            inner(local.right, sum)
        }

        inner(node, 0L)

        dfs(node.left)
        dfs(node.right)
    }

    dfs(root)

    return res
}