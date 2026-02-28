import DataStructure.Node

fun postorder(root: Node?): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    fun helper(node: Node?) {
        if (node == null) return


        for (v in node.children) {
            helper(v)
        }
        res.add(node.`val`)
    }

    helper(root)
    return res
}