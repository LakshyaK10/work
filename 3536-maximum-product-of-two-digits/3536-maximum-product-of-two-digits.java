class Solution {
    public int maxProduct(int n) {
        int m=size(n);
        if(m==1){
            return m;
        }
        int[] ans=new int[m];

        int idx=0;
        while(n>0){
            ans[idx]=n%10;
            n=n/10;
            idx++;
        }
        Arrays.sort(ans);
        return ans[m-1]*ans[m-2];
        // return m;
    }
    public int size(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}