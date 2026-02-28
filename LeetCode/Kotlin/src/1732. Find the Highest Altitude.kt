fun largestAltitude(gain: IntArray): Int {
    var res = 0
    var sum = 0

    for (num in gain) {
        sum += num
        res = maxOf(res, sum)
    }

    return res
}