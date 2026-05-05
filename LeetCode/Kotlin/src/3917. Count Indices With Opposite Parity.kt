private fun countOppositeParity(nums: IntArray): IntArray {
    val n = nums.size
    val res: IntArray = IntArray(n) { 0 }


    for (i in 0..<n) {
        var c = 0
        val num = nums[i] % 2
        for (j in i + 1..<n) {
            if (num != nums[j] % 2) c++
        }

        res[i] = c
    }

    return res
}
