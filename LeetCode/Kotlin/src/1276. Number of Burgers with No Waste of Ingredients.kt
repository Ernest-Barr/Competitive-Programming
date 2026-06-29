private fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> {
    /**
    x = jumbo
    y = small

    [4  2][x] = Tomato slices
    [1  1][y] = Cheese slices

    x_i = (detM_i) / detA

    detA = ad - bc 

    M1 = [tomato 2]
    [cheese 1]

    M2 = [4 tomato]
    [1 cheese]

    ans = [x_1, x_2] using equation for x_i from cramer's rule

    determinants must yield a positive integer when dividing since there can't be partial burgers
     */

    val detA = (4 * 1) - (2 * 1)
    val detM1 = (tomatoSlices * 1) - (2 * cheeseSlices)
    val detM2 = (4 * cheeseSlices) - (tomatoSlices * 1)
    val valid = detM1 >= 0 && detM2 >= 0 && detM1 % detA == 0 && detM2 % detA == 0

    return if (valid) listOf(detM1 / detA, detM2/ detA) else listOf()
}
