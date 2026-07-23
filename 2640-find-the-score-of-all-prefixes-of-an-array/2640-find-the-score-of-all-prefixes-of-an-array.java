class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;

        long[] ans=new long[n];

        long sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            long cur=(long)max+nums[i];
            sum=sum+cur;
            ans[i]=sum;
        }
        return ans;
    }
}