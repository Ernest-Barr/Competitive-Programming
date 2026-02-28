private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        if (numbers[l] + numbers[r] == target) {
            return intArrayOf(++l, ++r)
        } else if (numbers[l] + numbers[r] > target) {
            r--
        } else {
            l++
        }
    }
    return intArrayOf(-1)
}