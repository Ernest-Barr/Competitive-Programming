import DataStructure.TreeNode

private fun inorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = mutableListOf()
    fun inOrder(local: TreeNode?) {
        if(local == null) return
        inOrder(local.left)
        list.add(local.`val`)
        inOrder(local.right)
    }
    inOrder(root)

    return list
}