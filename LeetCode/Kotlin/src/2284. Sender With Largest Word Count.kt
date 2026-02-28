fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
    val map: MutableMap<String, Int> = mutableMapOf()

    for (i in senders.indices) {
        val wordCount = messages[i].count { it == ' ' } + 1
        map[senders[i]] = if (senders[i] in map) map[senders[i]]!! + wordCount else wordCount
    }

    var res = ""
    var maxCount = 0
    for ((sender, count) in map) {
        if (count > maxCount || count == maxCount && sender > res) {
            maxCount = count
            res = sender
        }
    }

    return res
}