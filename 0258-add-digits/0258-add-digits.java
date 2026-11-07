class Solution {
    public int addDigits(int num) {
        // Digital root formula: 1 + (num - 1) % 9
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}