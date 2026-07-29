class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n<m){
            return "";
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=m;

        int minlen=Integer.MAX_VALUE;
        int left=0;
        int start=0;
        
        for(int right=0;right<n; right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count--;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==0){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }

                char l=s.charAt(left);
                if(map.containsKey(l)){
                    map.put(l,map.get(l)+1);

                    if(map.get(l)>0){
                        count++;
                    }
                }

                left++;
            }
        }

        return minlen==Integer.MAX_VALUE? "": s.substring(start,start+minlen);
    }
}