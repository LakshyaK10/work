class Solution {
    public boolean isPalindromic(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
            int value=s.charAt(i);
            String binaryStr = String.format("%8s", Integer.toBinaryString(value)).replace(' ', '0');
            st=st+binaryStr;
            System.out.println(st);
        }
        int n=st.length();
        for(int i=0;i<n/2;i++){
            if(st.charAt(i)!=st.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}