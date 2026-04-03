fun levelMedian(
    root: TreeNode?,
    t: Int,
): Int {
    if (root == null) return -1
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    var curr = 0
    queue.add(root)

    while (queue.isNotEmpty()) {
        val level: MutableList<Int> = mutableListOf()

        repeat(queue.size) {
            val u = queue.removeFirst()

            level.add(u.`val`)

            if (u.left != null) queue.add(u.left)
            if (u.right != null) queue.add(u.right)
        }

        if (curr++ == t) return level[level.size / 2]
    }

    return -1
}
