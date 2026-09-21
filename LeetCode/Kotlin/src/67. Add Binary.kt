private fun addBinary(a: String, b: String): String {
    /**
    111
    001
    1000

    111
    011
    1010

    If there are 3 1s in the position, carry + two digits correspond to 1, then take carry % 2 as the digit
     */

    val res: StringBuilder = StringBuilder()
    val m = a.length
    val n = b.length

    var i = m - 1
    var j = n - 1
    var carry = 0

    while (i >= 0 || j >= 0 || carry > 0) {
        if (i >= 0 && a[i--] == '1') carry++
        if (j >= 0 && b[j--] == '1') carry++

        res.append(if (carry % 2 == 0) '0' else '1')
        carry /= 2
    }

    return res.toString().reversed()
}
