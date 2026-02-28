import DataStructure.TreeNode

private fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {

    if (root == null) {
        return TreeNode(`val`)
    } else {
        var current: TreeNode? = root
        var parent: TreeNode?
        var found = false
        while (!found) {
            parent = current
            if (`val` < current!!.`val`) {
                current = current.left
                if (current == null) {
                    found = true
                    parent?.left = TreeNode(`val`)
                }
            } else {
                current = current.right
                if (current == null) {
                    found = true
                    parent?.right = TreeNode(`val`)
                }
            }
        }
    }

    return root
}