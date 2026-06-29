package DataStructure

class Node(
    var `val`: Int,
) {
    // Graphs
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()

    // N-Ary Tree
    var children: List<Node?> = listOf()

    // Next Tree
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null

    // Random Pointer problems
    var random: Node? = null

    // Utility functions
    override fun toString(): String = `val`.toString()
}

typealias NodeCopy = Node
