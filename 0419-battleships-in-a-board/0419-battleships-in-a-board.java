class Solution {
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X' && !vis[i][j]){
                    dfs(i,j,vis,board);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int r,int c,boolean[][] vis, char[][] board){
        int n=board.length;
        int m=board[0].length;

        if(r>=n || r<0 || c>=m || c<0 || board[r][c]=='.' || vis[r][c]){
            return;
        }
        vis[r][c]=true;

        dfs(r+1,c,vis,board);
        dfs(r-1,c,vis,board);
        dfs(r,c+1,vis,board);
        dfs(r,c-1,vis,board);

    }
}