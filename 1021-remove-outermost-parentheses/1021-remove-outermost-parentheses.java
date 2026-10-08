class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int bal=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(bal>0){
                    result.append(ch);
                }
                bal++;
            }else{
                bal--;
                if(bal>0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}