import DataStructure.Node

private fun cloneGraph(node: Node?): Node? {
    val map: MutableMap<Node, Node> = mutableMapOf()

    fun dfs(parent: Node?): Node? {
        return when (parent) {
            null -> null
            in map -> map[parent]
            else -> {
                val new = Node(parent.`val`)
                map[parent] = new

                for (child in parent.neighbors) new.neighbors.add(dfs(child))

                new
            }
        }
    }
    
    return dfs(node)
}
