import DataStructure.TreeNode

private fun reverseOddLevels(root: TreeNode): TreeNode? {
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    queue.add(root)
    var level = 0

    while (queue.isNotEmpty()) {
        val list: MutableList<TreeNode> = mutableListOf()

        repeat(queue.size) {
            val node = queue.removeFirst()

            if (level and 1 == 1) list.add(node)
            if (node.left != null) queue.add(node.left!!)
            if (node.right != null) queue.add(node.right!!)
        }

        var l = 0
        var r = list.size - 1

        while (l <= r) {
            val temp = list[l].`val`

            list[l++].`val` = list[r].`val`
            list[r--].`val` = temp
        }

        level++
    }

    return root
}
