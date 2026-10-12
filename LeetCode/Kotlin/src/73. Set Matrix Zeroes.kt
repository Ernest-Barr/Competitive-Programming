private fun setZeroes(matrix: Array<IntArray>): Unit {
    val m = matrix.size
    val n = matrix[0].size

    /*
       O(m + n) space solution:
        Maintain two bool arrays, one for cols and one for rows

        If a value is a zero just update the corresponding array and simply update the matrix after every zero has been found

        O(mn) time

       O(1) space solution:

        Using first row and column as flags, acting as the arrays from the O(m + n) solution

        First determine if first row/col contains a zero since it will be overwritten

        Change all the first row to some arbitrary value, say 0 if false, 1 if true

        Next iterate from 1..<m and 1..<n and determine if the flag needs to be updated for that row/column
    */

    var rowZero = false
    var colZero = false

    for (i in 0..<m) if (matrix[i][0] == 0) colZero = true
    for (i in 0..<n) if (matrix[0][i] == 0) rowZero = true

    for (i in 1..<m) {
        for (j in 1..<n) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    for (i in 1..<m) {
        for (j in 1..<n) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0
            }
        }
    }

    if (rowZero) for (i in 0..<n) matrix[0][i] = 0
    if (colZero) for (i in 0..<m) matrix[i][0] = 0
}
