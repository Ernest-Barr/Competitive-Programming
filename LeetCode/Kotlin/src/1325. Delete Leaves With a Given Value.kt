import DataStructure.TreeNode

fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {

    fun postOrder(node: TreeNode?): TreeNode? {
        if (node == null) return null
        node.left = postOrder(node?.left)
        node.right = postOrder(node?.right)
        return if (node.left == null && node.right == null && node.`val` == target) null else node
    }

    return postOrder(root)
}