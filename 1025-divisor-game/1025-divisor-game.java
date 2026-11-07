class Solution {
    public boolean divisorGame(int N) {
        // Key insight: Alice wins if N is even
        // This is because:
        // - If N is even, Alice can always subtract 1, leaving Bob with odd N
        // - If N is odd, any divisor d is also odd, so N - d is even
        // - Eventually Bob leaves Alice with 2, Alice subtracts 1 and wins
        return N % 2 == 0;
    }
}