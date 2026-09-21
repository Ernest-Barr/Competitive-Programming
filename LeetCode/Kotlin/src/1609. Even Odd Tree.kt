import DataStructure.TreeNode

private fun isEvenOddTree(root: TreeNode?): Boolean {
    val queue: ArrayDeque<TreeNode?> = ArrayDeque()
    queue.add(root)

    var level = 0

    while (queue.isNotEmpty()) {
        val curr: MutableList<Int> = mutableListOf()

        repeat(queue.size) {
            val node = queue.removeFirst()
            curr.add(node!!.`val`)

            if (node.left != null) queue.add(node.left)
            if (node.right != null) queue.add(node.right)
        }

        for (num in curr) {
            val parity = num and 1
            when (level and 1) {
                0 -> if (parity == 0) return false
                1 -> if (parity == 1) return false
            }
        }

        for (i in 1..<curr.size) {
            when (level and 1) {
                0 -> if (curr[i - 1] >= curr[i]) return false
                1 -> if (curr[i - 1] <= curr[i]) return false
            }
        }

        level++
    }

    return true
}
