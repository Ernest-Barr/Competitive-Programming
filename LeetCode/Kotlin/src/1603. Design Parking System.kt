class ParkingSystem(var big: Int, var medium: Int, var small: Int) {

    fun addCar(carType: Int): Boolean {
        return when {
            carType == 3 && small-- > 0 -> true
            carType == 2 && medium-- > 0 -> true
            carType == 1 && big-- > 0 -> true
            else -> false
        }
    }
}
