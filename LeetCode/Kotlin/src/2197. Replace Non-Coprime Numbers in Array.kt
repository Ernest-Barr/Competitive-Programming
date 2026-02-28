private fun replaceNonCoprimes(nums: IntArray): List<Int> {

    // Euclid algorithm
    fun gcd(a: Int, b: Int): Int {
        var i = a
        var j = b

        while (j != 0) {
            val t = j
            j = i % j
            i = t
        }

        return i
    }

    val stack: ArrayDeque<Int> = ArrayDeque()

    for (num in nums) {
        var n = num
        while (!stack.isEmpty()) {
            val front = stack.last()
            val divisor = gcd(front, n)

            // LCM = (a * b)    GCD(a, b)
            // n = b
            // n will be replaced by lcm
            // LCM = n
            // n = (n * t) / gcd(n ,t)

            if (divisor > 1) {
                n = ((front.toLong() * n.toLong()) / divisor.toLong()).toInt()
                stack.removeLast()
            } else break
        }

        stack.addLast(n)
    }

    return stack
}