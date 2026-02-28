fun finalValueAfterOperations(operations: Array<String>): Int {
    var num = 0

    for (str in operations) {
        when (str[1]) {
            '+'  -> num++
            '-' -> num--
        }
    }

    return num
}