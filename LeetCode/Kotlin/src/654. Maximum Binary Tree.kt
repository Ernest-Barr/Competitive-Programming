import DataStructure.TreeNode

private fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
    val n = nums.size

    fun dfs(left: Int, right: Int): TreeNode? {
        if (left > right) return null

        var max = Int.MIN_VALUE
        var idx = -1

        for (i in left..right) {
            if (nums[i] > max) {
                max = nums[i]
                idx = i
            }
        }

        val node = TreeNode(max)

        node.left = dfs(left, idx - 1)
        node.right = dfs(idx + 1, right)

        return node
    }

    return dfs(0, n - 1)
}
