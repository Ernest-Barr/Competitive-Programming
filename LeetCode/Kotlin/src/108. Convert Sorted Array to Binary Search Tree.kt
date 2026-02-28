import DataStructure.TreeNode

private fun sortedArrayToBST(nums: IntArray): TreeNode? {

    fun helper(l: Int, r: Int): TreeNode? {
        if (l > r) return null
        val m = l + (r - l) / 2
        val root: TreeNode = TreeNode(nums[m])
        root.left = helper(l, m - 1)
        root.right = helper(m + 1, r)
        return root
    }

    return helper(0, nums.lastIndex)
}