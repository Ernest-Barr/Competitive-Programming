fun limitOccurrences(nums: IntArray, k: Int): IntArray {
    val res: MutableList<Int> = mutableListOf()
    var count = 1
    val n = nums.size
    res.add(nums[0])

    for (i in 1..<n) {
        if (nums[i] == nums[i - 1]) {
            count++
        } else {
            count = 1
        }

        if (count <= k) res.add(nums[i])
    }

    return res.toIntArray()
}
