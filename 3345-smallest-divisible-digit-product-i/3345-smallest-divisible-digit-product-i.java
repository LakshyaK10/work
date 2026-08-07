class Solution {
    public int smallestNumber(int n, int t) {
        int ans=n;
        int product=solve( n);
        while(product%t!=0){
            ans++;
            product=solve(ans);
        }
        return ans;
    }
    public int solve(int n){
        int product=1;
        while(n>0){
            product=product*(n%10);
            n=n/10;
        }
        return product;
    }
}