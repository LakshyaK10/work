class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int s1=0;
        int s2=0;
        int q1=0;
        int q2=0;

        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?'){
                if(i<n/2){
                    q1++;
                }else{
                    q2++;
                }
            }else{
                int digit=num.charAt(i)-'0';
                if(i<n/2){
                    s1+=digit;
                }else{
                    s2+=digit;
                }
            }
        }
        if((q1+q2)%2!=0){
            return true;
        }

        return (s1-s2)!=9* (q2-q1)/2;
    }
}