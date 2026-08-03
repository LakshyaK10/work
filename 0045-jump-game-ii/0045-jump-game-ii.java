class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int farest=0;
        int curend=0;
        
        for(int i=0;i<nums.length-1;i++){
            farest=Math.max(farest, i+nums[i]);
            
            if(i==curend){
                jump++;
                curend=farest;
            }
        }
        return jump;
    }
}