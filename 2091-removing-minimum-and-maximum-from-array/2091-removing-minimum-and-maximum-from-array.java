class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0;
        int min=0;
        int n=nums.length;


        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        System.out.println(max);
        System.out.println(min);



        if(min>max){
            int temp=max;
            max=min;
            min=temp;
        }

        return Math.min(((min+1)+ Math.min(max-min, n-max)), (n-max)+Math.min(min+1, max-min));
    }
}