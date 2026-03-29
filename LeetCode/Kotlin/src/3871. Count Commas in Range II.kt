fun countCommas(n: Long): Long {
    if (n < 1000L) return 0L

    /**

     New commas at:
     log(1000) = 3 -> 1 comma
     log(1000000) = 6 -> 2 commas

     Every time log increases by 3, new comma

     Q1:

     1 to 100k
     res = number of digits greater than 1000

     Q2:

     1 to 10^15
     max 5 commas in a number

     */

    // fun log10(num: Long): Int {
    //     var res = 0

    //     var cpy = num

    //     while (cpy != 0L) {
    //         res++
    //         cpy /= 10L
    //     }

    //     return res
    // }

    var curr = 1000L
    var res = 0L

    while (curr <= n) {
        res += n - curr + 1L
        curr *= 1000L
    }

    // println(1e15.toLong())

    return res
}
