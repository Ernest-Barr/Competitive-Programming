import DataStructure.NodeCopy
import DataStructure.Node

private fun copyRandomBinaryTree(root: Node?): NodeCopy? {
    val map: MutableMap<Node, NodeCopy> = mutableMapOf()

    fun dfs(node: Node?): NodeCopy? {
        return when (node) {
            null -> null
            in map -> map[node]
            else -> {
                val cpy = NodeCopy(node.`val`)
                map[node] = cpy

                cpy.left = dfs(node.left)
                cpy.right = dfs(node.right)
                cpy.random = dfs(node.random)

                cpy
            }
        }
    }

    return dfs(root)
}
