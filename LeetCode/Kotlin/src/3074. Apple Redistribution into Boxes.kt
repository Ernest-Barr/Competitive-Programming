fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
    capacity.sort()
    var res = 0
    var curr = 0
    var i = capacity.size - 1
    val sum = apple.sum()

    while (curr < sum) {
        curr += capacity[i--]
        res++
    }

    return res
}