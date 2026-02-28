fun minCost(colors: String, neededTime: IntArray): Int {
    var res = 0
    var i = 0

    while (i < colors.length) {
        var j = i + 1
        var sum = neededTime[i]
        var max = neededTime[i]

        while (j < colors.length && colors[i] == colors[j]) {
            sum += neededTime[j]
            max = maxOf(max, neededTime[j++])
        }

        res += sum - max
        i = j
    }

    return res
}