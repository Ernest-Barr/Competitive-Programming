private fun maxScoreWordsBF(words: Array<String>, letters: CharArray, score: IntArray): Int {
    /**

    We have a max total score, valid words, and frequencies of letters


    Case 1: Max = 33
    Case 2: Max = 37
    Case 3: Max = 6

    Let n = words.size
    n is small, consider a bactracking approach on words

    Must preprocess the frequencies of each letter of each word in words
    Must peprocess max frequencies of letters in words

    Can greedily consider subsets that have highest score


    Optimization:



     */

    val n = words.size
    val cand: MutableSet<List<String>> = mutableSetOf()
    val freq: IntArray = IntArray(26) { 0 }
    var res = 0

    fun dfs(curr: MutableList<String>, used: BooleanArray,  size: Int, idx: Int) {
        if (size == n) {
            cand.add(curr.toList())
            return
        }

        for (i in idx..<n) {
            if (used[i]) continue

            dfs(curr, used, size + 1, i + 1)
            curr.add(words[i])
            used[i] = true
            dfs(curr, used, size + 1, i + 1)
            curr.removeLast()
            used[i] = false
        }
    }

    dfs(mutableListOf(), BooleanArray(n) { false },  0, 0)

    for (c in letters) freq[c - 'a']++

    for (subset in cand) {
        val curr: IntArray = IntArray(26) { 0 }
        var count = 0
        var flag = false

        for (word in subset) {
            for (c in word) {
                val idx = c - 'a'

                curr[idx]++
                count += score[idx]

                if (curr[idx] > freq[idx]) {
                    flag = true
                    break
                }
            }

            if (flag) break
        }

        if (flag) continue

        res = maxOf(res, count)
    }

    return res
}

//TODO: Optimize for space complexity
