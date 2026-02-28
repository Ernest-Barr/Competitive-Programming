private class MyStack() {
    val list: MutableList<Int> = mutableListOf()
    fun push(x: Int) {
        list.add(x)
        for (i in list.indices - 1) list.add(list.removeFirst())
    }

    fun pop(): Int {
        return list.removeFirst()
    }

    fun top(): Int {
        return list.first()
    }

    fun empty(): Boolean {
        return list.isEmpty()
    }

}