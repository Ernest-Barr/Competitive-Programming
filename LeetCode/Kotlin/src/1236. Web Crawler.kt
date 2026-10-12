import java.util.Stack

private class HtmlParser {
    fun getUrls(url: String): List<String> {
        return emptyList()
    }
}

private fun crawl(startUrl: String, htmlParser: HtmlParser): List<String> {
    val res: MutableSet<String> = mutableSetOf()
    val stack: Stack<String> = Stack()
    val host = startUrl.split("/")[2]

    stack.push(startUrl)
    res.add(startUrl)

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        for (v in htmlParser.getUrls(u)) {
            if (v !in res && host in v) {
                stack.add(v)
                res.add(v)
            }
        }
    }

    return res.toList()
}
