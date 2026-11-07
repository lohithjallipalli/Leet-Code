class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result = new int[R * C][2];
        int index = 0;
        
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                // Manhattan distance
                result[index][0] = r;
                result[index][1] = c;
                index++;
            }
        }
        
        // Sort by Manhattan distance from (r0, c0)
        Arrays.sort(result, (a, b) -> {
            int distA = Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            int distB = Math.abs(b[0] - r0) + Math.abs(b[1] - c0);
            return Integer.compare(distA, distB);
        });
        
        return result;
    }
}