class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;

        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int idx, int[] nums, List<Integer> current, List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }

        //take
        current.add(nums[idx]);
        solve(idx+1,nums,current,ans);
        //nottake
        current.remove(current.size()-1);
        solve(idx+1,nums,current,ans);
    }
}