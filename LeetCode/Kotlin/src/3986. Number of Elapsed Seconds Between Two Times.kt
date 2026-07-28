private fun secondsBetweenTimes(startTime: String, endTime: String): Int {
    val start = startTime.split(":")
    val end = endTime.split(":")
    val start_s = start[0].toInt() * 3600 + start[1].toInt() * 60 + start[2].toInt()
    val end_s = end[0].toInt() * 3600 + end[1].toInt() * 60 + end[2].toInt()


    return end_s - start_s
}
