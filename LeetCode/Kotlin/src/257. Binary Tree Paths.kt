import DataStructure.TreeNode

private fun binaryTreePaths(root: TreeNode?): List<String> {
    val list: MutableList<String> = mutableListOf()

    fun preOrder(local: TreeNode?, str: String) {
        if (local == null) return
        val res = if (str == "") "" + local.`val` else str + "->" + local.`val`
        if (local.left == null && local.right == null) {
            list.add(res)
        }

        preOrder(local.left, res)
        preOrder(local.right, res)
    }

    preOrder(root, "")
    return list
}