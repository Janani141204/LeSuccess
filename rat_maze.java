class RatMaze {
    public List<String> findPath(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1)
            backtrack(0, 0, "", maze, visited, result, n);
        return result;
    }

    private void backtrack(int i, int j, String path, int[][] maze, boolean[][] visited, List<String> result, int n) {
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        if (i < 0 || j < 0 || i >= n || j >= n || visited[i][j] || maze[i][j] == 0)
            return;

        visited[i][j] = true;

        // D
        backtrack(i + 1, j, path + "D", maze, visited, result, n);
        // L
        backtrack(i, j - 1, path + "L", maze, visited, result, n);
        // R
        backtrack(i, j + 1, path + "R", maze, visited, result, n);
        // U
        backtrack(i - 1, j, path + "U", maze, visited, result, n);

        visited[i][j] = false; // backtrack
    }
}