fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
    asteroids.sort()
    var m: Long = mass.toLong()

    for (asteroid in asteroids) if (asteroid <= m) m += asteroid else return false

    return true
}
