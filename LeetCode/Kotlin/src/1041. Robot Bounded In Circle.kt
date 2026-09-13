private fun isRobotBounded(instructions: String): Boolean {
    var x = 0
    var y = 0
    var theta = 0

    /**
    Consider all changes in direction to be done (mod 4)

    0 = 360/0 // Up
    1 = 90 // East
    2 = 180 // Down
    3 = 270 // Left

    For R just add 1 and take mod 4
    For L just sub 1 and take mod 4
     */


    /**
    GLRLLGLL
    (0, 1, N)
    (0, 1, W)
    (0, 1, N)
    (0, 1, W)
    (0, 1, S)
    (0, 0, S)
    (0, 0, E)
    (0, 0, N)
     */

    for (c in instructions) {
        when (c) {
            'G' -> {
                when (theta) {
                    0 -> y++
                    1 -> x++
                    2 -> y--
                    else -> x--
                }
            }

            'L' -> theta = (theta - 1).mod(4)
            'R' -> theta = (theta + 1).mod(4)
        }
    }

    return theta != 0 || (x == 0 && y == 0)
}
