fun validWordSquare(words: List<String>): Boolean {

    for (i in 0..<words.size) {
        for (j in 0..<words[i].length) {
            if (j > words.size - 1 || i > words[j].length - 1 || words[i][j] != words[j][i]) return false
        }
    }

    return true
}