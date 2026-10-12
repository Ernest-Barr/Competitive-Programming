private class Trie() {
    class Node(var char: Char) {
        var accept: Boolean = false
        var adj: MutableMap<Char, Node> = mutableMapOf()
    }

    val root: Array<Node> = Array(26) { Node('a' + it) }

    fun insert(word: String) {
        var curr = root[word[0] - 'a']

        for (c in word) {
            if (c !in curr.adj) curr.adj[c] = Node(c)
            curr = curr.adj[c]!!
        }

        curr.accept = true
    }

    fun search(word: String): Boolean {
        var curr = root[word[0] - 'a']

        for (c in word) curr = curr.adj[c] ?: return false

        return curr.accept
    }

    fun startsWith(prefix: String): Boolean {
        var curr = root[prefix[0] - 'a']

        for (c in prefix) curr = curr.adj[c] ?: return false

        return true
    }

}
