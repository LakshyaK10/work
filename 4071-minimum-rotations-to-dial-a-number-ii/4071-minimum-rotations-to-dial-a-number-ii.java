class Solution {
    public int minRotations(int n, String s) {
        int sum=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i)-'0';
            sum+= Math.min(10-Math.abs(cur-prev), Math.abs(cur-prev));
            prev=cur;
        }
        
        String newi=s;
        int ans=sum;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,solve(newi,sum,i));
        }
        return ans;
    }

    public int solve(String s, int sum, int idx){
        if(idx==0){
            int old=dist(0, s.charAt(idx)-'0');
            int newi=dist(0,s.charAt(s.length()-1)-'0');
            return sum-old+newi;
        }

        int prev=s.charAt(idx-1)-'0';
        int old=s.charAt(idx)-'0';
        int newi=s.charAt(s.length()-1)-'0';

        return sum-dist(prev,old)+dist(prev,newi); 

    }
    public int dist(int x, int y){
        return Math.min(10-Math.abs(x-y), Math.abs(x-y));
        
    }
}