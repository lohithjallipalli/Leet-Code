class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length, m = grid[0].length, area = 0;
        
        // Top view: count cells with height > 0
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] > 0) area++;
        
        // Front view: max height in each row
        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            for (int j = 0; j < m; j++)
                rowMax = Math.max(rowMax, grid[i][j]);
            area += rowMax;
        }
        
        // Side view: max height in each column
        for (int j = 0; j < m; j++) {
            int colMax = 0;
            for (int i = 0; i < n; i++)
                colMax = Math.max(colMax, grid[i][j]);
            area += colMax;
        }
        
        return area;
    }
}