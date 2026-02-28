import java.util.Stack

private fun simplifyPath(path: String): String {
    val tokens = path.split("/")
    val stack: Stack<String> = Stack()
    val res: StringBuilder = StringBuilder()

    for (str in tokens) {
        if (str == "" || str == " " || str == ".") continue
        if (str == "..") {
            if (stack.isNotEmpty()) stack.pop()
        } else {
            stack.push(str)
        }
    }

    if (stack.isEmpty()) res.insert(0, "/")
    while (stack.isNotEmpty()) res.insert(0, "/" + stack.pop())

    return res.toString()
}