class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
            int idx=(i+k)%n;
            ans[idx]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        // System.out.println(ans[3]);
    }
}