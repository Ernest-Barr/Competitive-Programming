private fun canTransform(source: IntArray, target: IntArray): Boolean {
    val n = source.size
    var sum = 0L
    /**
    Assume same i and j for the following:

    First iteration:

    source[i] = source[i] + source[j] - delta
    source[j] = delta


    Second Iteration:

    source[i] = source[i] + delta - delta2
    source[j] = delta2


    source[i] becomes src[i] + src[j] - some difference between them?
    source[j] becomes delta


    Ex 1:

    src = [1,2,3], target = [0,2,4]
    - Different parities
    - arrays are not multiples of eachother
    - Testing divisbility does not work
    - Sum = 6 for both

    Ex 2:src =  [-5, -5], target = [-15,5 ]
    - Same parities
    - Divisibility does not work
    - Sum = -10 for both

    Ex 4: src = [-1, -33], target = [100, 100]
    - sums: -34, 200, expected is false
     **/

    for (i in 0..<n) {
        sum += source[i]
        sum -= target[i]
    }

    return sum == 0L
}
