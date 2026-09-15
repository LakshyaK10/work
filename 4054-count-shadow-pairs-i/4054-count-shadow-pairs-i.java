class Solution {
    public long shadowPairs(int[] nums) {
        Stack<Integer> s=new Stack<>();
        long count=0;
        int n=nums.length;
        
        s.add(nums[0]);

        for(int i=1;i<=n;i++){
            if(i<n && nums[i]>=s.peek() ){
                s.add(nums[i]);
            }else{
                long rem=1;
                while(s.size()>0 && (i==n || s.peek()>nums[i])){
                    int prev=s.pop();
                    if(s.size()>0 && prev!=s.peek()){
                        count=count+(s.size()*rem);
                        rem=1;
                    }else if(s.size()>0 && prev==s.peek()){
                        rem++;
                    }
                }
                if(i<n){
                    s.add(nums[i]);
                }
            }
        }
        return count;
    }
}