fun countCommas(n: Int): Int {
    if (n < 1000) return 0

    /**

     New commas at:
     log(1000) = 3 -> 1 comma
     log(1000000) = 6 -> 2 commas

     Every time log increases by 3, new comma

     Q1:

     1 to 100k
     res = number of digits greater than 1000
     */

    return n - 999
}
