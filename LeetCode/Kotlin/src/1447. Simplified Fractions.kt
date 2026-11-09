private fun simplifiedFractions(n: Int): List<String> {
    /**
    A fraction can be simplified when
    Let p = numerator
    Let q = denominator

    p != 1 && q % p == 0 means a fraction can be simplified
     */


    var p = 1

    if (n == 1) return listOf()

    val res: MutableList<String> = mutableListOf()

    fun gcd(a: Int, b:Int): Int = if (b == 0) a else gcd(b, a % b)

    while (p < n) {
        var q = p + 1
        while (q <= n) {
            if (gcd(p, q) == 1) res.add("${p}/${q}")
            q++
        }

        p++
    }

    return res
}
