import java.util.Stack

private fun removeAnagrams(words: Array<String>): List<String> {
    // If words[i - 1], words[i] are anagrams, Remove words[i]
    // Greedily merge left as long as the above operation is valid,
    // ^ Stack/Recursion

    fun isAnagram(str1: String, str2: String): Boolean {
        val chars = IntArray(26) { 0 }
        for (c in str1) chars[c - 'a']++
        for (c in str2) chars[c - 'a']--
        for (i in chars) if (i != 0) return false
        return true
    }

    val res: MutableList<String> = mutableListOf()
    val stack: Stack<String> = Stack()

    for (i in words.size - 1 downTo 0) {
        while (!stack.empty() && isAnagram(stack.peek(), words[i])) stack.pop()
        stack.push(words[i])
    }

    while (!stack.empty()) res.add(stack.pop())

    return res
}