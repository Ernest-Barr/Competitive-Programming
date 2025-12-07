fun convertTime(current: String, correct: String): Int {
    var curr = current.take(2).toInt() * 60 + current.substring(3).toInt()
    val target = correct.take(2).toInt() * 60 + correct.substring(3).toInt()

    var res = 0
    // 1, 5, 15, 60
    while (curr != target) {
        when {
            curr + 60 <= target -> curr += 60
            curr + 15 <= target -> curr += 15
            curr + 5 <= target -> curr += 5
            curr + 1 <= target -> curr += 1
        }

        res++
    }

    return res
}