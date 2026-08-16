class Solution {
    public int minOperations(String s) {
        int n=s.length();
        s=s+s;
        System.out.println(s.substring(1,1+n));
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,i+isPalin(s.substring(i,i+n)));
        }
        return ans;
    }
    public int isPalin(String s){
        int count=0;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            char f=s.charAt(i);
            char l=s.charAt(n-i-1);
            if(f!=l){
                count=count+Math.min(Math.abs(f-l),26-Math.abs(f-l));
            }
        }
        return count;
    }
}