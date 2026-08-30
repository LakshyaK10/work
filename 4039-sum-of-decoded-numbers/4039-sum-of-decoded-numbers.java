class Solution {
    public int sumDecoded(long[] nums) {
        long ans=0;
        long mod=1_000_000_007;

        for(long num:nums){
            int w=(int)(num%10);
            long d=num/10;

            String s=String.valueOf(d);
            String x_s=s.substring(0,w);
            String y_s=s.substring(w);

            long x=Long.parseLong(x_s);
            long y=Long.parseLong(y_s);
            System.out.println(y);

            ans=(ans+power(x,y,mod))%mod;
        }
        return (int)ans;
    }
    public long power(long x, long y ,long mod){
        long res=1;

        while(y>0){
            if(y%2==1){
                res=(res*x)%mod;
            }
            x=(x*x)%mod;
            y=y/2;
        }
        return res;
    }
}