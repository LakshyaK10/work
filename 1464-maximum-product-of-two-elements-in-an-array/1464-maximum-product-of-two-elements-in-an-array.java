class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int pos=(nums[n-1]-1)*(nums[n-2]-1);
        // int neg=(nums[0]-1)*(nums[1]-1);
        // return Math.max(pos,neg);

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }else if(num>max2){
                max2=num;
            }

            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }

        return Math.max((max1-1)*(max2-1), (min1-1)*(min2-1));
    }
}