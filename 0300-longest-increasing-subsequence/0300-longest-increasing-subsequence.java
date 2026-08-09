// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n=nums.length;
//         int[] dp=new int[n];
//         Arrays.fill(dp,1);

//         int ans=1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 if(nums[i]>nums[j]){
//                     dp[i]=Math.max(dp[i],dp[j]+1);
//                 }
//             }
//             ans=Math.max(ans,dp[i]);
//         }
//         return ans;
//     }
// }

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] tail=new int[n];

        int len=0;
        for(int num:nums){
            int left=0;
            int right=len;

            while(left<right){
                int mid=left+(right-left)/2;
                if(tail[mid]<num){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }

            tail[left]=num;
            if(left==len){
                len++;
            }
        }
        return len;
    }
}