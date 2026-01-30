fun passThePillow(n: Int, time: Int): Int {
    var dx = 1
    var count = 1

    repeat(time) {
        dx = when (count) {
            n -> -1
            1 -> 1
            else -> dx
        }

        count += dx
    }

    return count
}