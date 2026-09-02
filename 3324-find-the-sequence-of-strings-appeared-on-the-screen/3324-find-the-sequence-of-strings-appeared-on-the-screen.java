class Solution {
    public List<String> stringSequence(String target) {
        String str="";
        int n=target.length();
        List<String> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            str=str+'a';
            ans.add(str);

            while(str.charAt(i)!=target.charAt(i)){
                char l=str.charAt(i);
                l++;
                str=str.substring(0,i)+l;
                ans.add(str);
            }
        }
        return ans;
    }
}