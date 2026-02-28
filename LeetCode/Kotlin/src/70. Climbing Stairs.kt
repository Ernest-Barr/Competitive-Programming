fun climbStairs(n: Int): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()

    fun climb(num: Int): Int {
        return when (num) {
            0 -> 1
            1 -> 1
            2 -> 2
            in map -> map[num]!!
            else -> {
                map[num] = climb(num - 1) + climb(num - 2)
                return map[num]!!
            }


        }
    }



    return climb(n)
}