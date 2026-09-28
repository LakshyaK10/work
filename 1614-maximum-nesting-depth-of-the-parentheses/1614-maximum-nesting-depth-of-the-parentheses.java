class Solution {
    public int maxDepth(String s) {
        char[] ch= s.toCharArray();
        
        int maxcount=0;
        int count=0;

        for(int i=0;i<ch.length;i++){
            
            if(ch[i]=='('){
                count++;
            }
            else if(ch[i]==')'){
                count--;
            }else{
                count=count;
            }
                
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
        
    }
}