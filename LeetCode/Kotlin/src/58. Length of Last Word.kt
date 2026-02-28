private fun lengthOfLastWord(s: String): Int {
    val str = s.trim()
    var end = str.length - 1
    var len = 0
    if (str.length == 1) return 1

    while (end >= 0) {
        if (str[end] == ' ') break
        len++
        end--
    }
    return len
}

fun main() {

    println(lengthOfLastWord("Hello World "))
    println(lengthOfLastWord("Hello"))
    println(lengthOfLastWord("Hello asdfasdfasdf"))
    println(lengthOfLastWord("Hello asdfasdfasdf world test test test asdfasdfasdfasdfasdfasdf"))
    println(lengthOfLastWord(" The quick brown fox jumps over the lazy dog "))
}