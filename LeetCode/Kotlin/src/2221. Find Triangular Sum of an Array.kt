fun triangularSum(nums: IntArray): Int {
    fun calculate(arr: IntArray): Int {
        if (arr.size == 1) return arr[0]

        val new: IntArray = IntArray(arr.size - 1) { 0 }

        for (i in new.indices) {
            new[i] = (arr[i] + arr[i + 1]) % 10
        }

        return calculate(new)
    }

    return calculate(nums)
}