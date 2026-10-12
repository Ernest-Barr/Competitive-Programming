private fun buddyStrings(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false
    val n = s.length

    return when (s == goal) {
        true -> {
            val sfreq: IntArray = IntArray(26) { 0 }
            val gfreq: IntArray = IntArray(26) { 0 }

            for (i in 0..<n) {
                sfreq[s[i] - 'a']++
                gfreq[goal[i] - 'a']++

                if (sfreq[s[i] - 'a'] > 1 && gfreq[goal[i] - 'a'] > 1) return true
            }

            false
        }

        false -> {
            var count = 0

            var l = -1
            var r = -1

            for (i in 0..<n) {
                if (s[i] != goal[i]) {
                    count++
                    if (l == -1) l = i else if (r == -1) r = i
                }
                if (count > 2) return false

            }

            l != -1 && r != -1 && s.substring(0, l) + s[r] + s.substring(l + 1, r) + s[l] + s.substring(r + 1) == goal
        }
    }

}
