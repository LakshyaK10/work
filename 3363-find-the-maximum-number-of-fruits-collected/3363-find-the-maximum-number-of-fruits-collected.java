class Solution {
    int[][] dp;
    int n;
    public int maxCollectedFruits(int[][] fruits) {
        n=fruits.length;
        dp=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=fruits[i][i];
            fruits[i][i]=0;
        }

        ans+=dfs1(0,n-1,fruits);
        ans+=dfs2(n-1,0,fruits);
        return ans;
    }
    public int dfs1(int r, int c, int[][] fruits){
        if(r<0 || r>=n || c<0 || c>=n){
            return 0;
        }

        if(c<=r){
            return Integer.MIN_VALUE;
        }

        if(dp[r][c]!=-1){
            return dp[r][c];
        }

        int sum=Math.max(dfs1(r+1,c-1,fruits),Math.max(dfs1(r+1,c,fruits),dfs1(r+1,c+1,fruits)));
        return dp[r][c]=sum+fruits[r][c];

    }
    public int dfs2(int r, int c, int[][] fruits){
        if(r<0 || c>=n || c<0 || c>=n){
            return 0;
        }

        if(r<=c){
            return Integer.MIN_VALUE;
        }

        if(dp[r][c]!=-1){
            return dp[r][c];
        }

        int sum=Math.max(dfs2(r-1,c+1,fruits),Math.max(dfs2(r,c+1,fruits),dfs2(r+1,c+1,fruits)));
        return dp[r][c]=sum+fruits[r][c];
    }
}