fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
    val vol: Long = (length.toLong() * width.toLong() * height.toLong())
    val isBulky = length >= 1e4 || width >= 1e4 || height >= 1e4 || vol >= 1e9
    val isHeavy = mass >= 100

    return when {
        isHeavy && isBulky -> "Both"
        isBulky -> "Bulky"
        isHeavy -> "Heavy"
        else -> "Neither"
    }
}