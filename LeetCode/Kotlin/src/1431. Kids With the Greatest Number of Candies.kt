fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.max()
    val res: MutableList<Boolean> = MutableList(candies.size) { false }
    for (i in candies.indices) if (candies[i] + extraCandies >= max) res[i] = true

    return res
}