import DataStructure.TreeNode

private fun postorderTraversal(root: TreeNode?): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    fun postOrder(local: TreeNode?) {
        if (local == null) return
        postOrder(local.left)
        postOrder(local.right)
        res.add(local.`val`)
    }

    postOrder(root)
    return res
}

fun main() {
    val treeOne = TreeNode(5)
    treeOne.left = TreeNode(2)
    treeOne.left!!.right = TreeNode(3)
    treeOne.left!!.left = TreeNode(1)
    treeOne.right = TreeNode(9)
    treeOne.right!!.left = TreeNode(7)
    treeOne.right!!.right = TreeNode(10)
    println(postorderTraversal(treeOne).joinToString(", "))
}