import DataStructure.TreeNode

private fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
    fun min(local: TreeNode?): TreeNode? {
        var localRoot: TreeNode? = local ?: return null
        while (localRoot?.left != null) localRoot = localRoot?.left
        return localRoot
    }

    fun delete(local: TreeNode?, key: Int): TreeNode? {
        val localRoot: TreeNode = local ?: return null

        if (localRoot.`val` < key) localRoot.right = deleteNode(localRoot.right, key)
        else if (localRoot.`val` > key) localRoot.left = deleteNode(localRoot.left, key)
        else {
            if (localRoot.left == null) return localRoot.right
            if (localRoot.right == null) return localRoot.left

            val successor = min(localRoot.right)
            localRoot.`val` = successor!!.`val`
            localRoot.right = deleteNode(localRoot.right, successor.`val`)
        }

        return localRoot
    }

    return delete(root, key)
}