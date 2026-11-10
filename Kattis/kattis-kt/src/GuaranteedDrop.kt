import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var res = Double.MAX_VALUE

    repeat(n) {
        val p = sc.nextInt()
        val r = sc.nextDouble()
        val g = sc.nextInt()

        var ev = 0.0
        var prob = 1.0

        repeat(g) {
            ev += p * prob
            prob *= 1 - r
        }

        res = minOf(res, ev)
    }

    println(res)
}
