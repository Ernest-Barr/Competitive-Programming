import DataStructure.TreeNode

private fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return listOf()

    val queue: ArrayDeque<TreeNode?> = ArrayDeque()
    val res: MutableList<MutableList<Int>> = mutableListOf()
    queue.addLast(root)

    var level = 0
    while (queue.isNotEmpty()) {
        val list: MutableList<Int> = mutableListOf()
        for (i in 0..<queue.size) {
            val front = queue.removeFirst()

            if (front != null) list.add(front.`val`)
            if (front?.left != null) queue.addLast(front.left)
            if (front?.right != null) queue.addLast(front.right)
        }
        if (level % 2 == 1) list.reverse()
        res.add(list)
        level++
    }

    return res
}