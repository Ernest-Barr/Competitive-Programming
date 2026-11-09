private fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
    val n = players.size
    val m = trainers.size

    var i = 0
    var j = 0
    var res = 0

    players.sortDescending()
    trainers.sortDescending()

    while (i < n && j < m) {
        when {
            players[i] <= trainers[j] -> {
                i++
                j++
                res++
            }

            else -> i++
        }
    }

    return res
}
