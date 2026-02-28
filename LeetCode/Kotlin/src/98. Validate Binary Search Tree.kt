import DataStructure.TreeNode

private fun isValidBST(root: TreeNode?): Boolean {
    var prev: TreeNode? = null
    var res = true
    fun inOrder(root: TreeNode?) {
        if (root == null) return
        inOrder(root.left)

        if (prev != null && prev!!.`val` >= root.`val`) {
            res = false
            return
        }

        prev = root
        inOrder(root?.right)

    }
    inOrder(root)
    return res
}