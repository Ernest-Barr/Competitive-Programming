private fun isAnagram(s: String, t: String): Boolean {
    val table = IntArray(26) { 0 }
    if (s.length != t.length) return false

    for (i in s.indices) {
        table[(s[i].code - 97)]--
        table[t[i].code - 97]++
    }

    for (c in table) if (c != 0) return false

    return true
}

fun main() {
    println(isAnagram("anagram" ,"nagaram"))
    println(isAnagram("arc", "car"))
    println(isAnagram("arc", "cat"))
}