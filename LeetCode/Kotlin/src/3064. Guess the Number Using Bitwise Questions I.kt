/**
 * Definition of commonSetBits API (defined in the parent class Problem).
 * fun commonSetBits(num: Int): Int {}
 */

private fun commonSetBits(num: Int): Int = 0

private fun findNumber(): Int {
    var res = 0
    var curr = 1

    for (i in 0..<30) {
        // println(commonSetBits(curr))
        if (commonSetBits(curr) == 1) {
            res += curr
        }

        curr = curr shl 1
    }


    return res
}
