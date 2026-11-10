import java.util.Stack

private fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val n = pushed.size
    val stack: Stack<Int> = Stack()

    var i = 0
    var j = 0

    while (i < n || j < n) {
        if (i < n) stack.push(pushed[i])

        when {
            i == n && stack.peek() != popped[j] -> return false

            else -> {
                while (stack.isNotEmpty() && stack.peek() == popped[j]) {
                    stack.pop()
                    j++
                }
            }
        }

        i++
    }

    return true
}
