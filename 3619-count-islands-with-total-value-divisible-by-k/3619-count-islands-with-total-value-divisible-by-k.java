class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0 && !vis[i][j]){
                    long s=dfs(grid,i,j,vis);
                    if(s%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public long dfs(int[][]grid, int i, int j, boolean[][]vis){
        int n=grid.length;
        int m=grid[0].length;

        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0 || vis[i][j]){
            return 0;
        }

        vis[i][j]=true;

        long sum=grid[i][j];
        sum+=dfs(grid,i+1,j,vis);
        sum+=dfs(grid,i-1,j,vis);
        sum+=dfs(grid,i,j+1,vis);
        sum+=dfs(grid,i,j-1,vis);

        return sum;
    }
}