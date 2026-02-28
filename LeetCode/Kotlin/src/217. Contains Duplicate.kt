fun containsDuplicate(nums: IntArray): Boolean {
    val set: MutableSet<Int> = mutableSetOf()
    for (num in nums) if (num in set) return true else set.add(num)
    return false
}