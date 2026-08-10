class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;

        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(solve(nums,mid,k)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
    public boolean solve(int[] nums, int mid, int k){
        int sum=0;
        int count=1;

        for(int num:nums){
            if(sum+num>mid){
                count++;
                sum=num;

                if(count>k){
                    return false;
                }
            }else{
                sum+=num;
            }
        }
        return true;
    }
}