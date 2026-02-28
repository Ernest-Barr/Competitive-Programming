private fun countLargestGroup(n: Int): Int {
    val groups: IntArray = IntArray(46)

    for (i in 1..n) {
        var sum = 0
        var temp = i

        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        groups[sum]++
    }

    val max = groups.max()
    var res = 0

    for (i in groups) if (i == max) res++

    return res
}

fun main() {
    println(countLargestGroup(13) == 4)
    println(countLargestGroup(2) == 2)
}
