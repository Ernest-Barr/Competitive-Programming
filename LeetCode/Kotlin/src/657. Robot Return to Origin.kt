fun judgeCircle(moves: String): Boolean {
    var x = 0
    var y = 0

    for (m in moves) {
        when (m) {
            'U' -> y++
            'D' -> y--
            'L' -> x--
            'R' -> x++
        }
    }

    return x == 0 && y == 0
}