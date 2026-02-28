fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
    val m = l.size

    val res: MutableList<Boolean> = MutableList(m) { false }

    fun isArithmeticSubarray(arr: IntArray): Boolean {
        if (arr.size <= 2) return true
        arr.sort()

        val diff = arr[1] - arr[0]

        for (i in arr.indices) if (i > 0 && arr[i] - arr[i - 1] != diff) return false

        return true
    }

    for (i in l.indices) res[i] = isArithmeticSubarray(nums.copyOfRange(l[i], r[i] + 1))

    return res
}