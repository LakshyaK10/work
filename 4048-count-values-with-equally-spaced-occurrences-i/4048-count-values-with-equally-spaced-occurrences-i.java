class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(freq[nums[i]]==3 && nums[i]==nums[j] && nums[j]==nums[k]){
                        if(j-i==k-j){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}