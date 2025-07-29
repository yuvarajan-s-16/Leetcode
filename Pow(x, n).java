class Solution {
    public double myPow(double x, int n) {
        long m = n; // convert to long to handle Integer.MIN_VALUE
        if (m == 0) return 1.0;
        if (m < 0) {
            x = 1 / x;
            m = -m;
        }

        double ans = 1.0;
        while (m > 0) {
            if ((m & 1) == 1) ans *= x;
            x *= x;
            m >>= 1;
        }

        return ans;
    }
}
