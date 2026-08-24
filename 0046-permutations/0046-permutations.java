class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums,0);
        return ans;
    }
    public void backTrack(int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            backTrack(nums,idx+1);
            swap(nums,i,idx);
        }
        
    }
    public void swap(int[] nums, int i, int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}