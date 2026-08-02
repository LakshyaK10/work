class Solution {
    public int countValidPrefixes(String s) {
        int[] freq=new int[2];
        int count=0;
        int ans=0;

        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                freq[1]++;
            }else{
                freq[0]++;
            }
            count++;

            if(freq[0]==count/2 || freq[1]==count/2){
                ans++;
            }
        }
        return ans;
    }
}