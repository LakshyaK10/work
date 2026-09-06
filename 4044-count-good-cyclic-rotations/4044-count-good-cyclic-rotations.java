class Solution {
    public int countGoodRotations(int[] nums) {
        int count=0;
        int n=nums.length;
        long lsum=0;
        long rsum=0;
        for(int i=0;i<n/2;i++){
            lsum+=nums[i];
            rsum+=nums[i+(n/2)];
        }
        
        for(int i=0;i<n;i++){
            if(lsum>rsum){
                count++;
            }
            lsum=lsum-nums[i]+nums[(i+n/2)%n];
            rsum=rsum+nums[i]-nums[(i+n/2)%n];
            
        }
        System.out.println(lsum);
        return count;
    }
}