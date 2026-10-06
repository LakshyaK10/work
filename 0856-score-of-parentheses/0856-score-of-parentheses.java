class Solution {
    public int scoreOfParentheses(String s) {
        int size=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                size++;
            }else{
                size--;
                if(s.charAt(i-1)=='('){
                    count+=1<< size;
                }
                
            }
        }
        return count;
        
    }
}