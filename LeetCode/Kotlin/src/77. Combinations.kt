private fun combine(n: Int, k: Int): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()

    fun backtrack(i: Int, combination: MutableList<Int>) {
        if (combination.size == k) {
            res.add(combination.toList())
            return
        }

        for (j in i..n) {
            combination.add(j)
            backtrack(j + 1, combination)
            combination.removeLast()
        }
    }

    backtrack(1, mutableListOf())
    return res
}

fun main() {
    println(combine(4, 2).joinToString(", "))
    println(combine(1,1).joinToString(", "))
}