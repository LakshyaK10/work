class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i+1;j<i+k+1;j++){
                    sum+=code[j%n];
                }
                ans[i]=sum;
            }
        }else if(k<0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=1;j<=-k;j++){
                    int x=(i-j+n)%n;
                    sum+=code[x];
                }
                ans[i]=sum;
            }
        }
        return ans;
    }
}