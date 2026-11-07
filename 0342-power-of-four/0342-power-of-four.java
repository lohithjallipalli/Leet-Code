class Solution {
    public boolean isPowerOfFour(int n) {
        // A number is a power of 4 if:
        // 1. It's greater than 0
        // 2. It's a power of 2 (only one bit set): n & (n-1) == 0
        // 3. The set bit is in an even position (n & 0x55555555 != 0)
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}