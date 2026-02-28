import kotlin.math.abs

private fun countValidSelections(nums: IntArray): Int {
    val zeroes: MutableList<Int> = mutableListOf()
    var res = 0

    for (i in nums.indices) if (nums[i] == 0) zeroes.add(i)

    while (zeroes.isNotEmpty()) {
        var leftSum = 0
        var rightSum = 0
        val front = zeroes.removeFirst()

        for (i in 0..<front) leftSum += nums[i]
        for (i in front..<nums.size) rightSum += nums[i]

        if (leftSum == rightSum) res += 2 else if (abs(leftSum - rightSum) == 1) res += 1
    }

    return res
}

private fun countValidSelectionsOptimized(nums: IntArray): Int {
    var leftSum = 0
    var rightSum = nums.sum()
    var res = 0

    for (num in nums) {
        leftSum += num
        rightSum -= num

        if (num == 0) {
            res += when {
                rightSum == leftSum ->  2
                abs(rightSum - leftSum) == 1 ->  1
                else -> 0
            }
        }
    }

    return res
}