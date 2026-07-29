import DataStructure.TreeNode

private fun deepestLeavesSum(root: TreeNode?): Int {
    var res: Int = 0
    val queue: ArrayDeque<TreeNode?> = ArrayDeque()

    queue.add(root)

    while (queue.isNotEmpty()) {
        var level = 0

        repeat(queue.size) {
            val u = queue.removeFirst()

            level += u!!.`val`

            if (u.left != null) queue.add(u.left)
            if (u.right != null) queue.add(u.right)
        }

        res = level
    }

    return res
}
