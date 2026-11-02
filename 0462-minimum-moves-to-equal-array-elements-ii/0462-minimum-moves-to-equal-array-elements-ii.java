class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        int med=nums[nums.length/2];

        for(int n:nums){
            moves+=Math.abs(n-med);
        }
        return moves;
    }
}