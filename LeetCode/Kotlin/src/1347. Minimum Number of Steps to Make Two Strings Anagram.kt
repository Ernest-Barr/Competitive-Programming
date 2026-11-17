private fun minSteps(s: String, t: String): Int {
    var res = 0

    val sfreq = IntArray(26) { 0 }
    val tfreq = IntArray(26) { 0 }

    val n = s.length

    for (i in 0..<n) {
        sfreq[s[i] - 'a']++
        tfreq[t[i] - 'a']++
    }

    for (i in 0..<26) res += abs(sfreq[i] - tfreq[i])

    return res / 2
}
