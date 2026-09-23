class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        int target=sum-x;
        if(target==0){
            return n;
        }

        int len=-1;
        int j=0;
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            while(cursum>target && i>=j){
                cursum-=nums[j++];
            }
            if(cursum==target){
                len=Math.max(len, i-j+1);
            }
        }
        return len==-1 ? -1: n-len;
    }
}