fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
    val n = tickets.size
    var res = 0
    var i = 0

    while (tickets[k] != 0) {
        if (tickets[i] != 0) {
            tickets[i]--
            res++
        }

        i = (i + 1) % n
    }

    return res
}