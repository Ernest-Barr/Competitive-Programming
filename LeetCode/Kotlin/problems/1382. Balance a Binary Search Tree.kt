import DataStructure.TreeNode

fun balanceBST(root: TreeNode?): TreeNode? {
    fun dfs(node: TreeNode?, list: MutableList<Int>): MutableList<Int> {
        if (node == null) return list

        dfs(node.left, list)
        list.add(node.`val`)
        dfs(node.right, list)

        return list
    }

    val list: MutableList<Int> = dfs(root, mutableListOf())
    val n = list.size

    fun buildTree(low: Int, high: Int): TreeNode? {
        if (low > high) return null

        val m = low + (high - low) / 2
        val head = TreeNode(list[m])

        head.left = buildTree(low, m - 1)
        head.right = buildTree(m + 1, high)

        return head
    }

    return buildTree(0, n - 1)
}