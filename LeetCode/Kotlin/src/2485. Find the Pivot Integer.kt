fun pivotInteger(n: Int): Int {
    var lSum = n * (n + 1) / 2
    var rSum = 0

    for (i in n downTo 1) {
        lSum -= i
        if (lSum == rSum) return i
        rSum += i
    }

    return -1
}