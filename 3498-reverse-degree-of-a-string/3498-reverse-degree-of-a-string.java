class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char ch:s.toCharArray()){
            int dig=ch-'a'+1;
            int rev=27-dig;
            sum+=rev*i++;
            // System.out.println(sum);
        }
        return sum;
    }
}