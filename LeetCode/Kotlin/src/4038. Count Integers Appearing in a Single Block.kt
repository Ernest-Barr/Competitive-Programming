private fun countSpecialIntegers(nums: IntArray): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    var res = 0

    for ((i, num) in nums.withIndex()) {
        if (num !in map) map[num] = mutableListOf()
        map[num]!!.add(i)
    }


    for ((num, list) in map) {
        val n = list.size
        var valid = true

        for (i in 1..<n) {
            if (list[i - 1] + 1 != list[i]) {
                valid = false
                break
            }
        }

        if (valid) res++
    }


    return res
}
