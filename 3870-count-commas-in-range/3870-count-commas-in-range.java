class Solution {
    public int countCommas(int n) {
        long base=1000;
        int comas=0;
        while(base<=n){
            comas+=(n-base+1);
            base=base*1000;
        }
        return comas;
    }
}