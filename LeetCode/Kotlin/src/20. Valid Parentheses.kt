import java.util.*

private fun isValid(str: String): Boolean {
    val openChars = Stack<Char>()
    openChars.push('1')
    for (c in str) {
        when (c) {
            '(' -> {
                openChars.push(')')
            }

            '{' -> {
                openChars.push('}')
            }

            '[' -> {
                openChars.push(']')
            }

            openChars.peek() -> openChars.pop()
            else -> return false
        }
    }
    openChars.pop()
    return openChars.isEmpty()
}