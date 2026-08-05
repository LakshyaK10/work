class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] vis=new boolean[n][m];
        // for(int i=0;i<n;i++){
        //     dfs(i,0,grid,vis);
        //     dfs(i,m-1,grid,vis);
        // }

        // for(int j=0;j<m;j++){
        //     dfs(0,j,grid,vis);
        //     dfs(n-1,j,grid,vis);
        // }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    count=Math.max(count,solve(i,j,grid,vis));
                }
            }
        }
        return count;
    }
    public int solve(int r,int c,int[][] grid, boolean[][] vis){
        int n=grid.length;
        int m=grid[0].length;
        
        if(r<0 || r>=n || c<0 || c>=m || grid[r][c]==0 || vis[r][c]){
            return 0;
        }
        int ans=1;
        vis[r][c]=true;
        ans=ans+solve(r+1,c,grid,vis);
        ans+=solve(r-1,c,grid,vis);
        ans+=solve(r,c+1,grid,vis);
        ans+=solve(r,c-1,grid,vis);

        return ans;
    }
}