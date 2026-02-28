



// Accepted, but Invalid Solution, O(n) space
fun compressBrute(chars: CharArray): Int {

    var count = 1
    var res = ""

    for (i in 0..<chars.size - 1) {
        if (chars[i] == chars[i + 1]) {
            count++
        } else {
            res += if (count > 1) {
                chars[i] + "" +  count
            } else {
                chars[i]
            }
            count = 1
        }
    }

    res += if (count > 1) chars[chars.size - 1] + "" + count else chars[chars.size - 1]

    for (i in res.indices) chars[i] = res[i]
    return res.length
}