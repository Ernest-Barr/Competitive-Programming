fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    for (i in left..right) {
        var num = i
        var valid = true

        while (num > 0) {
            val digit = num % 10

            if (digit == 0 || i % digit != 0) {
                valid = false
                break
            }

            num /= 10
        }

        if (valid) res.add(i)

    }

    return res
}