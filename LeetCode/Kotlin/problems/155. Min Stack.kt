private class MinStack {
    val stack: MutableList<Pair<Int, Int>> = mutableListOf()

    fun push(num: Int) = stack.add(
        when (stack.size) {
            0 -> Pair(num, num)
            else -> Pair(num, minOf(getMin(), num))
        }
    )

    fun pop() = stack.removeAt(stack.size - 1)

    fun top(): Int = stack[stack.size - 1].first

    fun getMin(): Int = stack[stack.size - 1].second
}