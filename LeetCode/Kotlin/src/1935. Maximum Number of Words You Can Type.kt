fun canBeTypedWords(text: String, brokenLetters: String): Int {
    val arr: List<String> = text.split(" ")
    var res = arr.size

    for (word in arr) {
        for (c in word) {
            if (c in brokenLetters) {
                res--
                break
            }
        }
    }

    return res
}