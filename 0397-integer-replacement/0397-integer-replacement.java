class Solution {
    HashMap<Long,Integer> map=new HashMap<>();
    public int integerReplacement(int n) {
        return solve((long)n);
    }
    public int solve(long n){
        if(n==1){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int ans;
        if(n%2==0){
            ans=1+solve(n/2);
        }else{
            ans=1+Math.min(solve(n+1),solve(n-1));
        }
        map.put(n,ans);
        return ans;
    }
}