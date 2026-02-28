private fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if(magazine.length < ransomNote.length) return false
    val map: MutableMap<Char, Int> = mutableMapOf()

    for(c in magazine) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    for(c in ransomNote) {
        if(map.contains(c) && (map.getValue(c) > 0)) {
            map[c] = map.getValue(c) - 1
        } else {
            return false
        }
    }

    return true
}

fun main() {
    println(canConstruct("a", "b"))
    println(canConstruct("aa", "ab"))
    println(canConstruct("aa", "aab"))
}