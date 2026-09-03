class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int[] dp=new int[max+1];

        Arrays.fill(dp,-1);
        return solve(0,nums,map,dp);
    }
    public int solve(int idx,int[] nums, HashMap<Integer,Integer> map, int[] dp){
        if(idx>dp.length-1){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int nottake=solve(idx+1,nums,map,dp);
        int take=idx*map.getOrDefault(idx,0)+solve(idx+2,nums,map,dp);

        dp[idx]=Math.max(take,nottake);
        return dp[idx];
    }
}