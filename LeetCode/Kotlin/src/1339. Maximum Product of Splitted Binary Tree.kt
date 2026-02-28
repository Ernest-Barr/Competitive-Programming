import DataStructure.TreeNode

fun maxProduct(root: TreeNode?): Int {
    fun sum(node: TreeNode?): Int {
        if (node == null) return 0
        return node.`val` + sum(node.left) + sum(node.right)
    }

    val sum = sum(root)
    val mod = (1e9 + 7).toLong()
    var res = 0L

    // If we know the sum of a subtree, the answer is max( (total_sum - subtree_sum) * subtree_sum) in each node.
    // Post order
    fun dfs(node: TreeNode?): Long {
        if (node == null) return 0L
        val sub = node.`val` + dfs(node.left) + dfs(node.right)
        val prod = (sum - sub) * sub
        res = maxOf(res, prod)

        return sub
    }

    dfs(root)

    return (res % mod).toInt()
}