class Solution {
    public int minRotations(String s) {
        int sum=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i)-'0';
            sum+= Math.min(10-Math.abs(cur-prev), Math.abs(cur-prev));
            prev=cur;
        }
        return sum;
    }
}