class Solution {
    public int commonFactors(int a, int b) {
        // Count common factors of a and b
        // Must divide both a and b, so count divisors of gcd(a, b)
        int g = gcd(a, b);
        int count = 0;
        for (int i = 1; i * i <= g; i++) {
            if (g % i == 0) {
                count++; // i is a factor
                if (i != g / i) count++; // g/i is also a factor (different from i)
            }
        }
        return count;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}