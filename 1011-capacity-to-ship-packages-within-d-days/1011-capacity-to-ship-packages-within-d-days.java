class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right=0;
        int left=0;

        for(int num:weights){
            left=Math.max(left,num);
            right+=num;
        }

        while(left<right){
            int mid=left+(right-left)/2;

            if(solve(weights, days, mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean solve(int[] weights, int days, int mid){
        int cur=0;
        int req=1;

        for(int w:weights){
            if(w+cur>mid){
                req++;
                cur=0;
            }
            cur+=w;

            if(req>days){
                return false;
            }
        }
        return true;
    }
}