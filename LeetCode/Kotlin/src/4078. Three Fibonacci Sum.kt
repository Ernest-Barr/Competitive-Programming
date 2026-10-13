private fun threeFibonacciSum(n: Int): Boolean {
    val fib: MutableList<Int> = mutableListOf(0, 1)

    while (fib.last() <= n) fib.add(fib[fib.size - 2] + fib[fib.size - 1])
    for (i in 0..<fib.size - 2) if (fib[i] + fib[i + 1] + fib[i + 2] == n) return true

    return false
}
