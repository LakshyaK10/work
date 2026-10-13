class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        int left=0;
        int mid=n/2;
        long sum=0;
        for(int i=mid;i<n;i++){
            sum=sum+(long)(nums[i]*nums[i]);
        }

        for(int i=0;i<mid;i++){
            sum=sum-(long)(nums[i]*nums[i]);
        }
        System.out.println(sum);
        return sum;
    }
}