import java.util.*
import kotlin.math.*
import java.io.*


fun main() {
    val sc = Scanner(System.`in`)
    // n m

    val n = sc.nextInt() // Friends
    val m = sc.nextInt()  // Meals
    var sum =  0

    repeat(m) {
        sum += sc.nextInt()
        sc.nextLine()
    }

    println(if (sum % n == 0) 1 else 0)
}
