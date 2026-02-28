private fun reverseString(s: CharArray): Unit {
    var l = 0
    var r = s.size - 1
    while (l < r) {
        val temp = s[l]
        s[l] = s[r]
        s[r] = temp
        l++
        r--
    }
}

fun main() {
    var str: CharArray = "car".toCharArray()
    reverseString(str)
    println(str)

    str = "act".toCharArray()
    reverseString(str)
    println(str)
}