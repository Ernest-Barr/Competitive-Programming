import DataStructure.Node

private fun toArray(root: Node?): IntArray {
    val list: MutableList<Int> = mutableListOf()
    var curr = root

    while (curr != null) {
        list.add(curr.`val`)
        curr = curr?.next
    }

    return list.toIntArray()
}
