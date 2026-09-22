private class UndergroundSystem() {
    val map: MutableMap<Int, Pair<String, Int>> = mutableMapOf()
    val times: MutableMap<String, MutableList<Int>> = mutableMapOf()

    fun checkIn(id: Int, stationName: String, t: Int) {
        if (id in map) return
        map[id] = Pair(stationName, t)
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val key = map[id]!!.first + '-' + stationName

        if (key !in times) times[key] = mutableListOf()

        times[key]!!.add(t - map[id]!!.second)

        map.remove(id)
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        val key = startStation + '-' + endStation

        return times[key]!!.sum() / times[key]!!.size.toDouble()
    }

}
