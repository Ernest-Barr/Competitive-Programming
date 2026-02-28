private fun subsets(nums: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    val set: MutableList<Int> = mutableListOf()

    fun backtrack(i: Int) {
        if (i == nums.size) {
            res.add(set.toList())
            return
        }

        backtrack(i + 1)
        set.add(nums[i])
        backtrack(i + 1)
        set.removeLast()
    }

    backtrack(0)
    return res
}

fun main() {
    println(subsets(intArrayOf(1,2,3)).joinToString(", "))
    println(subsets(intArrayOf(0)).joinToString(", "))
}