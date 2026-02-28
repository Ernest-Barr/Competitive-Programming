fun deleteAndEarn(nums: IntArray): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()
    for (num in nums) map[num] = if (num in map) map[num]!! + 1 else 1

    val n = map.size
    val dp: IntArray = IntArray(n)
    val arr = nums.distinct().sorted()

    if (n == 1) return arr[0] * map[arr[0]]!!

    dp[0] = arr[0] * map[arr[0]]!!

    dp[1] = when (arr[1] - 1) {
        arr[0] -> maxOf(dp[0], arr[1] * map[arr[1]]!!)
        else -> dp[0] + (arr[1] * map[arr[1]]!!)
    }

    for (i in 2..<n) {
        dp[i] = when (arr[i] - 1) {
            arr[i - 1] -> maxOf(dp[i - 1], dp[i - 2] + arr[i] * map[arr[i]]!!)
            else -> dp[i - 1] + (arr[i] * map[arr[i]]!!)
        }
    }

    return dp[n - 1]
}