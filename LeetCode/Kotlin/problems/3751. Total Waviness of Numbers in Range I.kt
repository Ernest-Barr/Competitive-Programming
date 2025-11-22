fun totalWaviness(num1: Int, num2: Int): Int {
    var res = 0

    for (num in num1..num2) {

        val digits = num.toString()
        if (digits.length < 3) continue

        for (d in 1..<digits.length - 1) {
            when {
                digits[d] < digits[d - 1] && digits[d] < digits[d + 1] -> res += 1
                digits[d] > digits[d - 1] && digits[d] > digits[d + 1] -> res += 1
            }
        }
    }

    return res
}