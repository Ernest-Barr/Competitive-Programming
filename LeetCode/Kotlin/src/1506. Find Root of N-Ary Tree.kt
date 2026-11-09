import DataStructure.Node

private fun findRoot(tree: List<Node>): Node? {
    val arr = BooleanArray(tree.maxOf { it.`val`} + 1) { false }

    for (u in tree) {
        for (v in u.children) {
            arr[v!!.`val`] = true
        }
    }

    return tree.find { !arr[it.`val`] }
}
