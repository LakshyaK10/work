class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq=new int[10001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                freq[nums[i][j]]++;
            }
        }
        int count=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=1000;i++){
            if(freq[i]==count){
                ans.add(i);
            }
        }
        return ans;
    }
}