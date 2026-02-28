import DataStructure.TreeNode

fun averageOfLevels(root: TreeNode?): DoubleArray {
    if (root == null) return doubleArrayOf()
    val res: MutableList<Double> = mutableListOf()
    val queue: ArrayDeque<TreeNode> = ArrayDeque()

    queue.addLast(root)

    while (queue.isNotEmpty()) {
        var total: Long = 0
        val n = queue.size

        for (i in 0..<n) {
            val front = queue.removeFirst()

            total += front.`val`.toLong()
            if (front.left != null) queue.addLast(front.left!!)
            if (front.right != null) queue.addLast(front.right!!)
        }

        res.add(total / n.toDouble())
    }

    val arr: DoubleArray = DoubleArray(res.size)

    for (i in arr.indices) arr[i] = res[i]
    return arr
}