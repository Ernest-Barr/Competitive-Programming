import DataStructure.TreeNode

private fun maxLevelSum(root: TreeNode?): Int {
    if (root == null) return 1
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    queue.addLast(root)
    var res = 1
    var maxSum = Int.MIN_VALUE
    var currLevel = 1

    while (queue.isNotEmpty()) {
        var currSum = 0

        repeat(queue.size) {
            val front = queue.removeFirst()

            currSum += front.`val`
            if (front.left != null) queue.addLast(front.left!!)
            if (front.right != null) queue.addLast(front.right!!)
        }

        if (currSum > maxSum) {
            maxSum = currSum
            res = currLevel
        }

        currLevel++
    }


    return res
}