import DataStructure.TreeNode

private fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    if (root == null) return listOf()
    val queue: ArrayDeque<TreeNode?> = ArrayDeque()
    val res: MutableList<MutableList<Int>> = mutableListOf()

    queue.addLast(root)

    while (queue.isNotEmpty()) {
        val level: MutableList<Int> = mutableListOf()
        for (i in 0..<queue.size) {
            val front = queue.removeFirst()

            if (front != null) level.add(front.`val`)
            if (front?.left != null) queue.addLast(front.left)
            if (front?.right != null) queue.addLast(front.right)
        }

        res.add(0, level)
    }

    return res
}