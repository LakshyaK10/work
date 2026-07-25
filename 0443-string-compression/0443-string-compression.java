class Solution {
    public int compress(char[] chars) {
        // int n=chars.length;
        // if(n==1){
        //     return 1;
        // }
        // String s="";

        // char prev=chars[0];
        // int count=1;
        // for(int i=1;i<n;i++){
        //     if(prev==chars[i]){
        //         count++;
        //     }else{
        //         s=s+prev;
        //         if(count>1){
        //             s=s+count;
        //         }
        //         prev=chars[i];
        //         count=1;
        //     }
        // }
        // s=s+prev;
        // if(count>1){
        //     s=s+count;
        // }
        // for(int i=0;i<s.length();i++){
        //     chars[i]=s.charAt(i);
        // }
        // System.out.println(s);
        // return s.length();


        int read=0;
        int write=0;

        while(read<chars.length){
            char curr=chars[read];
            int count=0;

            while(read<chars.length && curr==chars[read]){
                read++;
                count++;
            }

            chars[write++]=curr;

            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}