import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val words = str.split(" ")
    val icpc = "ICPC"
    var i = 0

    if (words.size != 4) {
        println(0)
        return
    }

    for (w in words) {
        if (w[0] != icpc[i++]) {
            println(0)
            return
        }
    }

    println(1)
}
