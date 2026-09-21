private fun transformArray(nums: IntArray): IntArray {
    var even = 0
    var odd = 0

    for (num in nums) if (num and 1 == 0) even++ else odd++

    return IntArray(even) { 0 } + IntArray(odd) { 1 }
}
