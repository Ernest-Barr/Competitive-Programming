fun average(salary: IntArray): Double {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var sum = 0
    val n = salary.size - 2

    for (num in salary) {
        max = maxOf(max, num)
        min = minOf(min, num)
    }

    for (num in salary) if (num != min && num != max) sum += num

    return (sum / n.toDouble())
}