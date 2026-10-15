class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,dp,cost),solve(1,dp,cost));
    }
    public int solve(int idx, int[]dp,int[] cost){
        if(idx>=cost.length){
            return 0;
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }

        int one=cost[idx]+solve(idx+1, dp,cost);
        int two=cost[idx]+solve(idx+2,dp,cost);
        return dp[idx]=Math.min(one,two);
    }

}