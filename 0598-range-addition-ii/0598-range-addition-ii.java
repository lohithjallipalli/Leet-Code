class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // The result is determined by the smallest row and column in operations
        int minRow = m, minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minRow * minCol;
    }
}