private fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    val set: MutableList<Int> = mutableListOf()

    nums.sort()
    fun backtrack(i: Int) {
        if (i == nums.size) {
            if (set !in res) res.add(set.toList())
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
    println(subsetsWithDup(intArrayOf(1,2,2)).joinToString(", "))
    println(subsetsWithDup(intArrayOf(0)).joinToString(", "))
}