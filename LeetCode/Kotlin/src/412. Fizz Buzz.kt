private fun fizzBuzz(n: Int): List<String> {
    var res: MutableList<String> = mutableListOf()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> res.add("FizzBuzz")
            i % 3 == 0 -> res.add("Fizz")
            i % 5 == 0 -> res.add("Buzz")
            else -> res.add(i.toString())
        }
    }

    return res
}