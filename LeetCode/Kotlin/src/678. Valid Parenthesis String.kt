import java.util.Stack

private fun checkValidString(s: String): Boolean {
    /*
        *( -> false
     */
    val par: Stack<Int> = Stack()
    val ast: Stack<Int> = Stack()

    for (i in s.indices) {
        when (s[i]) {
            '(' -> par.push(i)
            ')' -> {
                when {
                    par.isEmpty() && ast.isEmpty() -> return false
                    par.isEmpty() && ast.isNotEmpty() -> ast.pop()
                    else -> par.pop()
                }
            }
            else -> ast.push(i)
        }
    }

    while (par.isNotEmpty() && ast.isNotEmpty()) {
        if (ast.peek() < par.peek()) return false

        par.pop()
        ast.pop()
    }

    return par.isEmpty()
}
