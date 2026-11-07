class Solution {
    public boolean isThree(int n) {
        // A number has exactly 3 divisors if and only if it's a square of a prime
        // Check if n is a perfect square
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) return false;
        
        // Check if sqrt is prime
        if (sqrt < 2) return false;
        for (int i = 2; i * i <= sqrt; i++) {
            if (sqrt % i == 0) return false;
        }
        return true;
    }
}