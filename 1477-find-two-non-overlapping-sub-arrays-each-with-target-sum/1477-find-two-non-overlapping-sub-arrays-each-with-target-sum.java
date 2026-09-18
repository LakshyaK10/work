class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int total=n+1;
        int sum=0;
        int left=0;
        int[] dp=new int[n+1];
        Arrays.fill(dp,n);
        for(int right=0;right<n;right++){
            sum+=arr[right];
            
            while(sum>target){
                sum-=arr[left++];
            }

            dp[right+1]=dp[right];
            if(sum==target){
                total=Math.min(total, right-left+1+dp[left]);
                dp[right+1]=Math.min(dp[right], right-left+1);
            }
        }
        return total==n+1? -1: total;
    }
}