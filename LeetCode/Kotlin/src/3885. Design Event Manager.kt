import java.util.PriorityQueue

class EventManager(
    events: Array<IntArray>,
) {
    val heap: PriorityQueue<Pair<Int, Int>> =
        PriorityQueue(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first })
    val map: MutableMap<Int, Int> = mutableMapOf()

    init {
        for ((id, p) in events) {
            map[id] = p
            heap.offer(Pair(id, p))
        }
    }

    fun updatePriority(
        eventId: Int,
        newPriority: Int,
    ) {
        heap.offer(Pair(eventId, newPriority))
        map[eventId] = newPriority
    }

    fun pollHighest(): Int {
        while (heap.isNotEmpty()) {
            val top = heap.poll()

            if (map[top.first] == top.second) {
                map[top.first] = -1
                return top.first
            }
        }

        return -1
    }
}
