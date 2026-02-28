import DataStructure.TreeNode


private fun invertTree(root: TreeNode?): TreeNode? {
    fun invert(root: TreeNode?) {
        if (root == null) return
        val temp = root.left
        root.left = root.right
        root.right = temp

        invert(root.left)
        invert(root.right)
    }
    invert(root)
    return root
}