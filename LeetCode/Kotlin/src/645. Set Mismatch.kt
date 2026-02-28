private fun findErrorNums(nums: IntArray): IntArray {
    val set = nums.toSet()
    var setSum = 0
    var sum = 0

    // result of summation from 1..n = n * (n + 1) / 2
    // sum = sum of nums in array
    // setSum = sum of non-duplicate numbers
    // Expected - setSum = missing
    // sum - setSum = duplicate
    val expected: Int = nums.size * (nums.size + 1) / 2

    for (num in nums) {
        sum += num
    }

    for (num in set) {
        setSum += num
    }

    return intArrayOf(sum - setSum, expected - setSum)
}

