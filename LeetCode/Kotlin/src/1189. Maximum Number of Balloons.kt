private fun maxNumberOfBalloons(text: String): Int {
    // Arr [b a l o n]
    val arr: IntArray = IntArray(5)
    for (c in text) {
        when (c) {
            'b' -> arr[0]++
            'a' -> arr[1]++
            'l' -> arr[2]++
            'o' -> arr[3]++
            'n' -> arr[4]++
        }
    }
    arr[2] /= 2
    arr[3] /= 2
    return arr.min()
}

fun main() {
    println(maxNumberOfBalloons("nlaebolko") == 1)
    println(maxNumberOfBalloons("loonbalxballpoon") == 2)
    println(maxNumberOfBalloons("leetcode") == 0)
}