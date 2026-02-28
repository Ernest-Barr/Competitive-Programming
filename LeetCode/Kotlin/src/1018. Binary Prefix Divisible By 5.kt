fun prefixesDivBy5(nums: IntArray): List<Boolean> {
    val res: MutableList<Boolean> = mutableListOf()
    var curr = 0

    for (num in nums) {
        curr = ((curr shl 1) + num) % 5
        res.add(curr == 0)
    }

    return res
}