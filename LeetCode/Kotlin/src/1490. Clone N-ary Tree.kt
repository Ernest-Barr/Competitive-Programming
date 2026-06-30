import DataStructure.Node

private fun cloneTree(root: Node?): Node? = when (root) {
    null -> root
    else -> {
        val node = Node(root.`val`)
        val children: MutableList<Node?> = mutableListOf()

        for (child in root.children) children.add(cloneTree(child))

        node.children = children

        node
    }
}
