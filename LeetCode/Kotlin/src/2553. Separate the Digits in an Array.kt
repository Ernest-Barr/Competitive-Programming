private fun separateDigits(nums: IntArray): IntArray {
    val res: MutableList<Int> = mutableListOf()

    fun getDigits(num: Int): List<Int> {
        val digits: MutableList<Int> = mutableListOf()
        var cpy = num

        while (cpy != 0) {
            digits.add(0, cpy % 10)
            cpy /= 10
        }

        return digits
    }

    for (num in nums) res += getDigits(num)

    return res.toIntArray()
}
