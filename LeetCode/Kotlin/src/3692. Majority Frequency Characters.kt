private fun majorityFrequencyGroup(s: String): String {
    val freqMap: MutableMap<Char, Int> = mutableMapOf()
    val groupMap: MutableMap<Int, String> = mutableMapOf()

    for (c in s) freqMap[c] = if (c in freqMap) freqMap[c]!! + 1 else 1
    for ((c, freq) in freqMap) groupMap[freq] = (if (freq in groupMap) groupMap[freq] + c else c).toString()

    var res: String = ""
    var maxFreq = 0

    for ((freq, group) in groupMap) {
        if (group.length > res.length) {
            maxFreq = freq
            res = group
        } else if (group.length == res.length) {
            if (freq > maxFreq) {
                maxFreq = freq
                res = group
            }
        }
    }

    return res
}