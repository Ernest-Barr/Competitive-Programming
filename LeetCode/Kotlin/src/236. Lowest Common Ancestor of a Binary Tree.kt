private fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    return when (root) {
        null -> null
        p, q -> root
        else -> {
            val left = lowestCommonAncestor(root.left, p, q)
            val right = lowestCommonAncestor(root.right, p, q)

            if (left != null && right != null) root else left ?: right
        }
    }
}
