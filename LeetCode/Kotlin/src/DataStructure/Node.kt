package DataStructure

class Node(var `val`: Int) {
    // Graphs
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()

    // N-Ary Tree
    var children: List<Node?> = listOf()
    override fun toString(): String {
        return `val`.toString()
    }
}