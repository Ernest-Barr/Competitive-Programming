fun minimumPairRemoval(nums: IntArray): Int {
    fun isIncreasing(arr: MutableList<Int>): Boolean {
        for (i in 1..<arr.size) if (arr[i - 1] > arr[i]) return false
        return true
    }

    var res = 0
    val arr = nums.toMutableList()

    while (!isIncreasing(arr)) {
        var min: Pair<Int, Int> = Pair(Int.MAX_VALUE, arr.size + 1)

        for (i in 0..<arr.size - 1) {
            if (arr[i] + arr[i + 1] < min.first) {
                min = Pair(arr[i] + arr[i + 1], i)
            }
        }

        arr.removeAt(min.second + 1)
        arr[min.second] = min.first
        res++
    }

    return res
}