fun dietPlanPerformance(calories: IntArray, k: Int, lower: Int, upper: Int): Int {
    val n = calories.size
    var res = 0
    var sum = 0
    var l = 0

    for (i in 0..<k) sum += calories[i]

    for (r in k..<n) {
        res += when {
            sum < lower -> -1
            sum > upper -> 1
            else -> 0
        }

        sum += calories[r]
        sum -= calories[l++]
    }

    return when {
        sum < lower -> res - 1
        sum > upper -> res + 1
        else -> res
    }
}