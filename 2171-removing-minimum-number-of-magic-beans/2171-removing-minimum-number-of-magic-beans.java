class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        // long min=Long.MAX_VALUE;
        // for(int i=0;i<beans.length;i++){
        //     int target=beans[i];
        //     long sum=0;
        //     for(int j=0;j<beans.length;j++){
        //         if(beans[j]<target){
        //             sum=sum+(long)beans[j];
        //         }else{
        //             sum=sum+(long)(beans[j]-target);
        //         }
        //     }
        //     min=Math.min(min,sum);
        // }
        // return min;

        long sum=0;
        for(int num:beans){
            sum+=num;
        }

        long min=Long.MAX_VALUE;
        for(int i=0;i<beans.length;i++){
            long target=beans[i];
            long rem=target*(beans.length-i);
            long temp=sum-rem;

            min=Math.min(min,temp);

        }
        return min;
    }
}