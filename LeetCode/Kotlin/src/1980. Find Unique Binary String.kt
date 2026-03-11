fun findDifferentBinaryString(nums: Array<String>): String {
    // range = 2^n
    val n = nums.size
    val set: MutableSet<Int> = mutableSetOf()

    for (num in nums) set.add(num.toInt(2))

    val lower = 1 shl n

    for (i in 0..<lower) if (i !in set) return i.toString(2).padStart(n, '0')

    return ""
}
