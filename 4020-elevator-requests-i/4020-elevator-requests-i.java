class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int prev=0;
        int ans=0;
        for(int num:requests){
            if(prev!=num){
                ans+=Math.abs(prev-num);
                prev=num;
            }
        }
        return ans;
    }
}