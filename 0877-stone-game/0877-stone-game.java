class Solution {
    public boolean stoneGame(int[] piles) {
    //     int n=piles.length;

    //     Integer[][] dp=new Integer[n][n];
    //     return solve(0,n-1,dp,piles)>=0;
    // }
    // public int solve(int i, int j, Integer[][] dp,int[] piles){
    //     if(i==j){
    //         return piles[i];
    //     }

    //     if(dp[i][j]!=null){
    //         return dp[i][j];
    //     }

    //     int takeleft=piles[i]-solve(i+1, j, dp, piles);
    //     int takeright=piles[j]-solve(i, j-1, dp,piles);

    //     return dp[i][j]=Math.max(takeleft,takeright);

     return true;
    }
}