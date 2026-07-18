class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        return gdc(s,l);
    }
    public int gdc(int i , int j){
        while(j!=0){
            int temp=j;
            j=i%j;
            i=temp;
        }
        return i;
    }
}