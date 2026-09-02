class Solution {
    public int numDecodings(String s) {
        int n=s.length();

        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,s,dp);
    }

    public int solve(int idx, String s, int[] dp){
        if(idx==s.length()){
            return 1;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        if(s.charAt(idx)=='0'){
            return 0;
        }

        int single=solve(idx+1,s,dp);
        int doub=0;
        if(idx+1<s.length()){
            int dig=Integer.parseInt(s.substring(idx,idx+2));

            if(dig>=10 && dig<=26){
                doub=solve(idx+2,s,dp);
            }
        }
        dp[idx]=single+doub;
        return dp[idx];
    }
}