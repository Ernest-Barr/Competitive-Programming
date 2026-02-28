import java.util.Stack

fun removeStars(s: String): String {
    val stack: Stack<Char> = Stack()
    var res = ""

    for (c in s) {
        when (c) {
            '*' -> stack.pop()
            else -> stack.push(c)
        }
    }

    while (stack.isNotEmpty()) res += stack.pop()

    return res.reversed()
}