import DataStructure.Node

private fun connectBF(root: Node?): Node? {
    val queue: ArrayDeque<Node?> = ArrayDeque()

    queue.add(root)

    while (queue.isNotEmpty()) {
        val level: MutableList<DataStructure.Node?> = mutableListOf()

        repeat(queue.size) {
            val u = queue.removeFirst()

            if (u?.left != null) queue.add(u.left)
            if (u?.right != null) queue.add(u.right)

            level.add(u)
        }

        val n = level.size

        for (i in 0..<n - 1) level[i]!!.next = level[i + 1]
    }

    return root
}

private fun connect(root: Node?): Node? {
    fun dfs(node: Node?) {
        if (node == null) return

        dfs(node.left)
        dfs(node.right)
    }

    dfs(root)

    return root
}
