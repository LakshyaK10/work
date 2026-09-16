class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        if(k==1){
            return n;
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,s,k,dp);
    }
    public int solve(int idx, String s, int k ,int[] dp){
        if(idx==s.length()){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int nottake=solve(idx+1,s,k,dp);
        int take=0;
        for(int j=idx+1;j<s.length();j++){
            if(isPal(s,idx,j,k)){
                take=Math.max(take,1+solve(j+1,s,k,dp));
            }
        }
        return dp[idx]=Math.max(take,nottake);
    }
    public boolean isPal(String s, int i, int j, int k){
        if(j-i+1<k){
            return false;
        }

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}