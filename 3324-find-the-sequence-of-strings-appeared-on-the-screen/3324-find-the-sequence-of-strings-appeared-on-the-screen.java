class Solution {
    public List<String> stringSequence(String target) {
        // String str="";
        // int n=target.length();
        // List<String> ans=new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     str=str+'a';
        //     ans.add(str);

        //     while(str.charAt(str.length()-1)!=target.charAt(i)){
        //         char l=str.charAt(str.length()-1);
        //         l++;
        //         str=str.substring(0,str.length()-1)+l;
        //         ans.add(str);
        //     }
        // }
        // return ans;


        StringBuilder str=new StringBuilder();
        List<String> ans=new ArrayList<>();

        for(int i=0;i<target.length();i++){
            str.append('a');
            ans.add(str.toString());

            while(str.charAt(i)!=target.charAt(i)){
                str.setCharAt(i,(char)(str.charAt(i)+1));
                ans.add(str.toString());
            }
        }
        return ans;
    }
}