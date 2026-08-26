class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int count=0;
        int len=Integer.MAX_VALUE;
        int start=0;
        int left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(ch=='1'){
                count++;
            }

            while(count==k){
                int curlen=right-left+1;
                if(curlen<len){
                    len=curlen;
                    start=left;
                }else if(curlen==len){
                    if(lexicographically(start, len, left,s)){
                        start=left;
                    }
                }
                if(s.charAt(left)=='1'){
                    count--;
                }
                left++;
            }


        }
        if(len==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+len);
    }
    public boolean lexicographically(int prev, int len, int cur, String s){
        String p = s.substring(prev, prev + len);
        String n = s.substring(cur, cur + len);

        return n.compareTo(p) < 0;
    }   
}