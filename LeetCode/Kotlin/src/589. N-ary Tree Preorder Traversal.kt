import DataStructure.Node

fun preorder(root: DataStructure.Node?): List<Int> {

    val res: MutableList<Int> = mutableListOf()

    fun helper(node: Node?) {
        if (node == null) return

        res.add(node.`val`)
        for (v in node.children) {
            helper(v)
        }
    }

    helper(root)

    return res
}