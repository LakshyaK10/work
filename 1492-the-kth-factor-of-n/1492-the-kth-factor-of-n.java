class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        if(ans.size()<k){
            return -1;
        }
        return ans.get(k-1);
    }
}