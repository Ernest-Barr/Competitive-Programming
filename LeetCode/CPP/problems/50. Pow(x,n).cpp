double myPow(double x, int n) {
        double res = 1.0;
        long long exp = n < 0 ?  -static_cast<long long>(n) : n;

        while (exp > 0) {
            if (exp % 2L == 0L) {
                x *= x;
                exp /= 2L;
            } else {
                res *= x;
                exp--;
            }
        }

        return n < 0 ? 1.0 / res : res;
}