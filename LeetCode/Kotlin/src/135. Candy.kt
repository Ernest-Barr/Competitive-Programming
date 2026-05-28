fun candy(ratings: IntArray): Int {
    val n = ratings.size
    val candies: IntArray = IntArray(n) { 1 }

    for (i in 1..<n) if (ratings[i] > ratings[i - 1]) candies[i] = candies[i - 1] + 1
    for (i in n - 2 downTo 0) if (ratings[i] > ratings[i + 1]) candies[i] = maxOf(candies[i], candies[i + 1] + 1)

    return candies.sum()
}
