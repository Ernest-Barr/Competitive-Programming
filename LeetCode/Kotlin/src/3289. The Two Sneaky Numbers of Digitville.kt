private fun getSneakyNumbers(nums: IntArray): IntArray {
    val set: MutableSet<Int> = mutableSetOf()
    val res = IntArray(2) { 0 }

    var i = 0
    for (num in nums) if (num !in set) set.add(num) else res[i++] = num

    return res
}