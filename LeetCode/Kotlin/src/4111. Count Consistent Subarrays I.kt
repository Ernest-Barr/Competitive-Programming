private fun countConsistent(nums: IntArray): Int {
    var res = 0
    val n = nums.size

    for (i in 0..<n) {
        var min = Int.MAX_VALUE
        var curr = nums[i]

        for (j in i..<n) {
            curr = curr and nums[j]
            min = minOf(min, nums[j])

            if (curr == min) res++
        }
    }


    return res
}
