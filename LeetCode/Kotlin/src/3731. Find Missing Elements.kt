fun findMissingElements(nums: IntArray): List<Int> {
    val res: MutableList<Int> = mutableListOf()
    val set = nums.toSet()
    val min = nums.min()
    val max = nums.max()

    for (i in min..max) if (i !in set) res.add(i)

    return res
}
