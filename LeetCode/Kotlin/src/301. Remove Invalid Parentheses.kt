private fun removeInvalidParenthesesBF(s: String): List<String> {
    /**

    Backtracking
    Can verify a string in linear time

    Can get an initial count of removals in linear time

    Backtracking:

    Generate all possible strings using preprocessed indices that can be removed, up to the k allowed removals
    where k is the minimum number of removals

    Depth of letters cannot change

    See case 1:
    "()())()"

    There are two closing braces that can be removed to create the same answer, therefore one can be skipped
     */

    val n = s.length
    var k = 0 // Number of closing brackets to remove
    var l = 0 // NUmber of opening brackets to remove
    var m = 0

    for (c in s) {
        when (c) {
            '(' -> {
                m++
                l++
            }

            ')' -> {
                m++
                if (l > 0) l-- else k++
            }
        }
    }

    if (k + l == m) {
        return listOf(s.replace("[()]".toRegex(), ""))
    }


    val cand: MutableList<String> = mutableListOf()

    fun dfs(curr: String, left: Int, right: Int, idx: Int) {
        if (left + right == k + l) {
            cand.add(curr)
            return
        }

        for (i in idx..<curr.length) {
            if (i - 1 in idx..<curr.length && curr[i] == curr[i - 1]) continue

            when (curr[i]) {
                '(' -> if (left != l) dfs(
                    curr.substring(0, i) + curr.substring(i + 1),
                    left + 1,
                    right,
                    i
                )

                ')' -> if (right != k) dfs(
                    curr.substring(0, i) + curr.substring(i + 1),
                    left,
                    right + 1,
                    i
                )
            }
        }
    }

    dfs(s, 0, 0, 0)

    // Do verification step of all strings in res before returning

    val res: MutableList<String> = mutableListOf()

    for (str in cand) {
        var a = 0
        var b = 0

        for (c in str) {
            when (c) {
                '(' -> a++
                ')' -> if (a > 0) a-- else b++
            }
        }

        if (a + b == 0) res.add(str)
    }

    return res
}

//TODO: Optimize
