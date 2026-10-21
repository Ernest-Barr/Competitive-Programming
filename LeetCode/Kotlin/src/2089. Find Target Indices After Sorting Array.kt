private fun targetIndices(nums: IntArray, target: Int): List<Int> {
    var less = 0
    var equal = 0

    for (num in nums) {
        when {
            num < target -> less++
            num == target -> equal++
        }
    }

    return List(equal) {it + less}
}
