class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        s=s+s;
        int count=0;

        for(int i=0;i<n;i++){
            String sub=s.substring(i,i+n);
            if(solve(sub)==k){
                count++;
            }
        }
        return count;
    }
    public int solve(String sub){
        int n=sub.length();
        int count=0;
        for(int i=1;i<n;i++){
            if(sub.charAt(i)==sub.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}