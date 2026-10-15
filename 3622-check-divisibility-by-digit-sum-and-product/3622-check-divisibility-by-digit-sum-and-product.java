class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0){
            sum+=temp%10;
            prod*=temp%10;
            temp=temp/10;
        }

        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}