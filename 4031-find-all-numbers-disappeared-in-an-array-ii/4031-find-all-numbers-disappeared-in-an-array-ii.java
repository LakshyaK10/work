class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        int l=lower;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<lower || nums[i]>upper){
                continue;
            }

            if(nums[i]>l){
                ans.add(Arrays.asList(l,nums[i]-1));
            }
            l=nums[i]+1;
        }
        if(l<=upper){
            ans.add(Arrays.asList(l,upper));
        }
        return ans;
    }
}