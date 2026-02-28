import java.util.*

private fun calPoints(operations: Array<String>): Int {
    val stack = Stack<Int>()
    var res = 0
    for (i in operations.indices) {
        when (operations[i]) {
            "C" -> {
                stack.pop()
            }

            "D" -> {
                stack.push(stack.peek() * 2)
            }

            "+" -> {
                val temp = stack.pop()
                val prev = stack.peek()
                stack.push(temp)
                stack.push(stack.peek() + prev)
            }

            else -> {
                stack.push(operations[i].toInt())
            }
        }
    }

    while (!stack.isEmpty()) {
        res += stack.pop()
    }

    return res
}

fun main() {
    println(calPoints(arrayOf("5", "2", "C", "D", "+")) == 30)
    println(calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")) == 27)
    println(calPoints(arrayOf("1", "C")) == 0)
}