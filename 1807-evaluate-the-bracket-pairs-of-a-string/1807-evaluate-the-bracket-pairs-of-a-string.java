class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1) );
        }

        StringBuilder cur=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        boolean inside=false;

        for(char c:s.toCharArray()){
            if(c=='('){
                inside=true;
            }else if(c==')'){
                if(map.containsKey(cur.toString())){
                    ans.append(map.get(cur.toString()));
                }else{
                    ans.append("?");
                }
                inside=false;
                cur.setLength(0);
            }else if(inside){
                cur.append(c);
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}