class Leaderboard() {
    val map: MutableMap<Int, Int> = mutableMapOf()

    fun addScore(playerId: Int, score: Int) {
        map[playerId] = if (playerId in map) map[playerId]!! + score else score
    }

    fun top(K: Int): Int {
        return map.values.toList().sortedDescending().take(K).sum()
    }

    fun reset(playerId: Int) {
        map[playerId] = 0
    }

}
