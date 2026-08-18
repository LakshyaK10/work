class Solution {
    public int findDuplicate(int[] nums) {
        //can do using hashmap or count or sorting... BUT THIS IS THE MOST OPTIMAL SOL AS IT TAKES TC AS O(N) AND SC AS O(1)
        int slow=nums[0];
        int fast=nums[0];

        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}