import DataStructure.TreeNode

private fun kthSmallest(
    root: TreeNode?,
    k: Int,
): Int {
    // LNR traversal
    var c: Int = 0
    var res = 0

    fun inOrder(node: TreeNode?) {
        if (node == null) return
        inOrder(node.left)
        c++
        if (c == k) {
            res = node.`val`
            return
        }
        inOrder(node.right)
    }
    inOrder(root)
    return res
}
