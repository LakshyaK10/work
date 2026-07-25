class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        int num=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                num=nums[i];
            }

            if(num==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}