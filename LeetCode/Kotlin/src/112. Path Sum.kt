import DataStructure.TreeNode

private fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    fun dfs(local: TreeNode?, currSum: Int): Boolean {
        val sum = currSum + (local?.`val` ?: 0)
        return when {
            local == null -> false
            sum == targetSum && local.right == null && local.left == null -> true
            else -> dfs(local.left, sum) || dfs(local.right, sum)
        }
    }

    return dfs(root, 0)
}