import DataStructure.TreeNode

fun findTarget(root: TreeNode?, k: Int): Boolean {
    val set: MutableSet<Int> = mutableSetOf()

    var found = false
    fun dfs(node: TreeNode?) {
        if (node == null) return

        dfs(node.left)
        if ((k - node.`val`) in set) found = true
        set.add(node.`val`)
        dfs(node.right)
    }

    dfs(root)
    return found
}