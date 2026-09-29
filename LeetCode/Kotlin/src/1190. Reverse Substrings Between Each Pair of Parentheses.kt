import java.util.Stack

private fun reverseParentheses(s: String): String {
    val str = s.toMutableList()
    val res = StringBuilder()
    val stack: Stack<Int> = Stack()

    for (i in str.indices) {
        when (str[i]) {
            '(' -> stack.push(i)
            ')' -> {
                var l = stack.pop() + 1
                var r = i - 1

                while (l < r) {
                    val temp = str[r]
                    str[r--] = str[l]
                    str[l++] = temp
                }
            }
        }
    }

    for (c in str) if (c != ')' && c != '(') res.append(c)

    return res.toString()
}
