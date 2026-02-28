fun countCollisions(directions: String): Int {
    val n = directions.length
    var i = 0
    var j = n - 1
    var res = 0

    while (i < n && directions[i] == 'L') i++
    while (j >= 0 && directions[j] == 'R') j--

    while (i <= j) {
        if (directions[i] == 'L' || directions[i] == 'R') res++
        i++
    }

    return res
}