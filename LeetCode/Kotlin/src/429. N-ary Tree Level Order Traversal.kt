import DataStructure.Node

fun levelOrder(root: Node?): List<List<Int>> {
    if (root == null ) return listOf()
    val res: MutableList<List<Int>> = mutableListOf()

    val queue: ArrayDeque<Node> = ArrayDeque()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val level: MutableList<Int> = mutableListOf()

        repeat(queue.size) {
            val front = queue.removeFirst()

            level.add(front.`val`)
            for (v in front.children) {
                if(v != null) queue.add(v)
            }
        }

        res.add(level)
    }

    return res
}