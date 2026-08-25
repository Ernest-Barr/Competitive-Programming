fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
    val map: MutableMap<Int, BooleanArray> = mutableMapOf()
    var res = 2 * n

    for ((row, seat) in reservedSeats) {
        if (row !in map) map[row] = BooleanArray(11) { false }

        map[row]!![seat] = true
    }

    // If 2/3 is reserved or 8/9 is reserved only one
    // If any of

    /**

    Valid configurations:
    left = 2,3,4,5
    right = 4,5,6,7
    middle = 6,7,8,9


     */


    for ((row, seats) in map) {
        var left = true
        var right = true
        var middle = true

        for (seat in 2..5) {
            if (seats[seat]) {
                left = false
                break
            }
        }

        for (seat in 6..9) {
            if (seats[seat]) {
                right = false
                break
            }
        }

        for (seat in 4..7) {
            if (seats[seat]) {
                middle = false
                break
            }
        }

        res -= when {
            left && right -> 0
            left || right -> 1
            !left && !right && middle -> 1
            else -> 2
        }
    }

    return res
}
