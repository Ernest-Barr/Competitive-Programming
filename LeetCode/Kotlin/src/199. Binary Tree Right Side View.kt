import DataStructure.TreeNode

fun rightSideViewBFS(root: TreeNode?): List<Int> {
    if (root == null) return listOf()
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    val res: MutableList<Int> = mutableListOf()
    queue.addLast(root)


    while(queue.isNotEmpty()) {
        val level: MutableList<Int> = mutableListOf()

        for (i in 0..<queue.size) {
            val node = queue.removeFirst()

            level.add(node.`val`)
            if (node.left != null) queue.addLast(node.left!!)
            if (node.right != null) queue.addLast(node.right!!)
        }

        res.add(level.last())
    }

    return res
}

//DFS is faster

fun rightSideViewDFS(root: TreeNode?): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    fun dfs(node: TreeNode?, depth: Int) {
        if (node == null) return

        if (depth == res.size) res.add(node.`val`)

        dfs(node.right, depth + 1)
        dfs(node.left, depth + 1)
    }

    dfs(root, 0)

    return res

}