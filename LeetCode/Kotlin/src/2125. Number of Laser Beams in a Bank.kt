private fun numberOfBeams(bank: Array<String>): Int {
    var prev = 0
    var res = 0

    for (row in bank) {
        var count = 0
        for (col in row) if (col == '1') count++

        if (count > 0) {
            res += prev * count
            prev = count
        }
    }

    return res
}