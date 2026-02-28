import java.util.*

private fun dailyTemperatures(temperatures: IntArray): IntArray {
    val res = IntArray(temperatures.size) { 0 }
    val stack: Stack<Int> = Stack()

    for (i in temperatures.indices.reversed()) {
        while (stack.isNotEmpty() && temperatures[stack.peek()] <= temperatures[i]) stack.pop()
        if (stack.isNotEmpty()) res[i] = stack.peek() - i
        stack.push(i)
    }
    return res
}