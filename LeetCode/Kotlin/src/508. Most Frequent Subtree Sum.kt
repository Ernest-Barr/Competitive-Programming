import DataStructure.TreeNode

private fun findFrequentTreeSum(root: TreeNode?): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val res: MutableList<Int> = mutableListOf()
    var max = Int.MIN_VALUE

    fun dfs(node: TreeNode?):  Int {
        if (node == null) return 0

        val sum = dfs(node.left) + dfs(node.right) + node.`val`
        map[sum] = (map[sum] ?: 0) + 1
        max = maxOf(max, map[sum]!!)

        return sum
    }

    dfs(root)

    for ((sum, freq) in map) {
        if (freq == max) res.add(sum)
    }

    return res.toIntArray()
}
