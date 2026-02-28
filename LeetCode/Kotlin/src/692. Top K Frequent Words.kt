import java.util.*

fun topKFrequent(words: Array<String>, k: Int): List<String> {

    val map: MutableMap<String, Int> = mutableMapOf()
    val pq = PriorityQueue(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })

    for (str in words) map[str] = if(str in map) map[str]!! + 1 else 1

    for ((str, freq) in map) pq.offer(Pair(str, freq))
    val res: MutableList<String> = mutableListOf()
    for (i in 0..<k) res.add(pq.poll().first)

    return res
}