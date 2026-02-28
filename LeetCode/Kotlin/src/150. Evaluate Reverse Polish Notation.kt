import java.util.*


private fun evalRPN(tokens: Array<String>): Int {
    val stack: Stack<Int> = Stack<Int>()

    for (i in tokens.indices) {
        when (tokens[i]) {
            "+" -> {
                val temp = stack.pop()
                val prev = stack.pop()
                stack.push(prev + temp)
            }

            "-" -> {
                val temp = stack.pop()
                val prev = stack.pop()
                stack.push(prev - temp)
            }

            "*" -> {
                val temp = stack.pop()
                val prev = stack.pop()
                stack.push(prev * temp)
            }

            "/" -> {
                val temp = stack.pop()
                val prev = stack.pop()
                stack.push(prev / temp)
            }

            else -> {
                stack.push(tokens[i].toInt())
            }
        }
    }

    return stack.pop()
}

fun main() {
    println(evalRPN(arrayOf("2", "1", "+", "3", "*")) == 9)
    println(evalRPN(arrayOf("4", "13", "5", "/", "+")) == 6)
    println(evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")) == 22)
}