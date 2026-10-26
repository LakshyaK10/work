class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 && close(grid,i,j)){
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean close(int[][] grid, int i, int j){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        
        if(grid[i][j]==1){
            return true;
        }

        grid[i][j]=1;
        boolean down=close(grid,i+1,j);
        boolean up=close(grid,i-1,j);
        boolean right=close(grid,i,j+1);
        boolean left=close(grid,i,j-1);
        return  down && up && left && right;
    } 
}