import DataStructure.TreeNode

fun increasingBST(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val arr: MutableList<Int> = mutableListOf()

    fun dfs(node: TreeNode?) {
        if (node == null) return

        dfs(node.left)
        arr.add(node.`val`)
        dfs(node.right)
    }

    dfs(root)
    val n = arr.size
    val res: TreeNode? = TreeNode(arr[0])
    var copy = res

    for (i in 1..<n) {
        copy?.right = TreeNode(arr[i])
        copy = copy?.right
    }

    return res
}
