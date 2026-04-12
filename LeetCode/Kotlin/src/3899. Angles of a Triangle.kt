import kotlin.math.PI
import kotlin.math.acos

fun internalAngles(sides: IntArray): DoubleArray {
    /*
        Triangle Properties:

        For any two sides a and b, a + b > c

        Angles must add up to 180

        Law of cosines:
        https://en.wikipedia.org/wiki/Law_of_cosines

        c^2 = a^2 + b ^2 - 2abcos(theta)
        a^2 = b^2 + c^2 - 2bccos(theta)
        b^2 = a^2 + c^2 - 2accos(theta)


        cos(theta) = (b^2 +c^2 - a^2) / 2bc
            - theta = cos^-1((b^2 +c^2 - a^2) / 2bc)

        - theta  = cos^-1((a^2 + c^2 - b^2) / 2ac)


     */

    sides.sort()

    val a = sides[0].toDouble()
    val b = sides[1].toDouble()
    val c = sides[2].toDouble()

    if (a + b > c) {
        val res: DoubleArray = DoubleArray(3)

        res[0] = acos((b * b + c * c - a * a) / (2 * b * c)) * (180.0 / PI)
        res[1] = acos((a * a + c * c - b * b) / (2 * a * c)) * (180.0 / PI)
        res[2] = 180.0 - res[0] - res[1]

        res.sort()
        return res
    }

    return doubleArrayOf()
}
