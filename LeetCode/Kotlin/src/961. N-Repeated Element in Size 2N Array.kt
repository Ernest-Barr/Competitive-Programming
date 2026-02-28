fun repeatedNTimes(nums: IntArray): Int {
    val set: MutableSet<Int> = mutableSetOf()

    for (num in nums) {
        if (num in set) return num
        set.add(num)
    }

    return -1
}