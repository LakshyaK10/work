class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        // int[] q=new int[100001];
        // for(int i=0;i<queries.length;i++){
        //     for(int j=queries[i][0];j<=queries[i][1];j++){
        //         q[j]++;
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     nums[i]=Math.max(0,nums[i]-q[i]);
        // }

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         return false;
        //     }
        // }
        // return true;

        int n=nums.length;
        int[] q=new int[n+1];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];

            q[l]++;
            if(r+1<n){
                q[r+1]--;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            count+=q[i];
            if(count<nums[i]){
                return false;
            }
        }
        return true;
    }

}