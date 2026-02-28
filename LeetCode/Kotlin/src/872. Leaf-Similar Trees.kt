import DataStructure.TreeNode

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val tree1: MutableList<Int> = mutableListOf()
    val tree2: MutableList<Int> = mutableListOf()

    fun post(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        post(node.left, list)
        post(node.right, list)
        if (node.left == null && node.right == null) list.add(node.`val`)
    }

    post(root1, tree1)
    post(root2, tree2)

    return tree1 == tree2
}