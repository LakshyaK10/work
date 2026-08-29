class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;

        for(int num:nums){
            sum+=num;
        }
        if(sum%k!=0){
            return false;
        }

        Arrays.sort(nums);
        int target=sum/k;
        boolean[] vis=new boolean[nums.length];
        
        return solve(nums, nums.length-1,k,0 ,target, vis);
    }
    public boolean solve(int[] nums, int idx, int k, int cursum, int target, boolean[] vis){
        if(k==1){
            return true;
        }
        if(cursum==target){
            return solve(nums, nums.length-1,k-1, 0, target, vis);
        }

        for(int i=idx;i>=0;i--){
            if(vis[i]){
                continue;
            }
            if(nums[i]+cursum>target){
                continue;
            }

            vis[i]=true;
            if(solve(nums,i-1,k,cursum+nums[i], target,vis)){
                return true;
            }
            vis[i]=false;
        }
        return false;
    }
}