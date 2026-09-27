class Solution {
    long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even, odd;
        if(n % 2 == 0) {
            even = pow(5,n/2);
            odd = pow(4,n/2);
        }else {
            even=pow(5,(n/2)+1);
            odd=pow(4,n/2);
        }

        return (int)((even*odd)%MOD);
    }
    public long pow(long x, long n) {
        long ans=1;

        while (n>0) {
            if (n%2==1) {
                ans=(ans*x)%MOD;
            }
            x=(x*x)%MOD;
            n=n/2;
        }

        return ans;
    }
}