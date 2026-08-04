import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // List<Integer> ans = new ArrayList<>();

        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i + 1] - nums[i] > 1) {
        //         for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
        //             ans.add(j);
        //         }
        //     }
        // }
        // return ans;

        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        Set<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();

        for(int x:nums){
            mini=Math.min(mini,x);
            maxi=Math.max(maxi,x);
            set.add(x);
        }

        for(int i=mini+1;i<maxi;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
