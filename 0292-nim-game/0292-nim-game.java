class Solution {
    public boolean canWinNim(int n) {
        // Key insight: First player wins if n % 4 != 0
        return n % 4 != 0;
    }
}