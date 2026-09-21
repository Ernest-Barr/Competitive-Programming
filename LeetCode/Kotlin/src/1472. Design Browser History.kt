private class BrowserHistory(val homepage: String) {
    val list: MutableList<String> = mutableListOf(homepage)
    var idx = 0

    fun visit(url: String) {
        idx++
        list.subList(idx, list.size).clear()
        list.add(url)
    }

    fun back(steps: Int): String {
        idx = maxOf(0, idx - steps)
        return list[idx]
    }

    fun forward(steps: Int): String {
        idx = minOf(list.size - 1, idx + steps)
        return list[idx]
    }
}
