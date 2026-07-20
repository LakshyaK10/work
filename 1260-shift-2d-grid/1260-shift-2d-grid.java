class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int total = n * m;

        k %= total;

        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int idx = i * m + j;
                int newIdx = (idx + k) % total;

                int newRow = newIdx / m;
                int newCol = newIdx % m;

                ans[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(ans[i][j]);
            }
            res.add(row);
        }

        return res;
    }
}