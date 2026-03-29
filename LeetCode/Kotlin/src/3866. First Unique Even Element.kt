fun firstUniqueEven(nums: IntArray): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (num in nums) map[num] = if (num in map) map[num]!! + 1 else 1

    for (num in nums) if (num % 2 == 0 && map[num] == 1) return num

    return -1
}
