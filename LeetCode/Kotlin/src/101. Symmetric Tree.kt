import DataStructure.TreeNode

private fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) return true
    fun dfs(l: TreeNode?, r: TreeNode?): Boolean {
        if (l == null && r == null) return true
        if (l == null || r == null) return false

        return l.`val` == r.`val` && dfs(l.left, r.right) && dfs(r.left, l.right)
    }

    return dfs(root.left, root.right)
}