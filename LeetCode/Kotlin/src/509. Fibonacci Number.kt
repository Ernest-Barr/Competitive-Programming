fun fib(n: Int): Int {
    fun helper(n: Int, list: MutableList<Int>): Int {
        if (n == 0 || n == 1) return n

        if (list[n] != -1) return list[n]

        list[n] = helper(n - 1, list) + helper(n - 2, list)
        return list[n]
    }

    return helper(n, MutableList(n + 1) { -1 })
}

fun main() {
    println(fib(2) == 1)
    println(fib(3) == 2)
    println(fib(4) == 3)
}