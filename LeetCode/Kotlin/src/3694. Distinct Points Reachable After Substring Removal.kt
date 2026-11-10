private fun distinctPoints(s: String, k: Int): Int {
    val n = s.length
    data class MutPair(var x: Int, var y: Int)

    operator fun MutPair.plus(other: MutPair): MutPair = MutPair(this.x + other.x, this.y + other.y)
    operator fun MutPair.minus(other: MutPair): MutPair = MutPair(this.x - other.x, this.y - other.y)

    val set: MutableSet<MutPair> = mutableSetOf()
    val pref: Array<MutPair> = Array (n + 1) { MutPair(0, 0) }

    for (i in 1..n) {
        pref[i].x = pref[i - 1].x + when (s[i - 1]) {
            'L' -> -1
            'R' -> 1
            else -> 0
        }

        pref[i].y = pref[i - 1].y + when (s[i - 1]) {
            'D' -> -1
            'U' -> 1
            else -> 0
        }
    }

    for (r in k..n) set.add(pref[r] - pref[r - k])

    return set.size
}
