class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board, String word, int i, int j, int idx, boolean[][] visited) {
        if (idx == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (visited[i][j] || board[i][j] != word.charAt(idx)) return false;
        visited[i][j] = true;
        int[] dirs = {1, -1, 0, 0, 1};
        boolean found = dfs(board, word, i + 1, j, idx + 1, visited) ||
                       dfs(board, word, i - 1, j, idx + 1, visited) ||
                       dfs(board, word, i, j + 1, idx + 1, visited) ||
                       dfs(board, word, i, j - 1, idx + 1, visited);
        visited[i][j] = false;
        return found;
    }
}