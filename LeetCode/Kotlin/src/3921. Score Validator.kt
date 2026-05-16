private fun scoreValidator(events: Array<String>): IntArray {
    var score = 0
    var counter = 0
    var i = 0
    val n = events.size

    while (i < n && counter != 10) {
        val c = events[i]
        when {
            c[0] in '0'..'6' -> score += c.toInt()
            c == "W" -> counter++
            else -> score += 1
        }
        i++
    }

    return intArrayOf(score, counter)
}
