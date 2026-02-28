fun countOperations(num1: Int, num2: Int): Int {
    var res = 0

    var i = num1
    var j = num2

    while (i != 0 && j != 0) {
        when {
            i <= j -> j -= i
            else -> i -= j
        }
        res++
    }

    return res
}