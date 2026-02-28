private fun hammingWeight(n: Int): Int {
    var count = 0
    for (i in 0..31) if (n and (1 shl i) != 0) count++
    return count
}

fun main() {
    println(hammingWeight(1))
    println(hammingWeight(3))
    println(hammingWeight(2))
    println(hammingWeight(105))
    println(hammingWeight(15))
    println(hammingWeight(16))
}