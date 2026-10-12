class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] arr=new int[n+1];

        for(int i=0;i<ranges.length;i++){
            if(ranges[i]==0){
                continue;
            }
            int l=Math.max(0,i-ranges[i]);
            arr[l]=Math.max(arr[l],i+ranges[i]);
        }

        int count=0;
        int farest=0;
        int end=0;
        for(int i=0;i<arr.length && end<n ;end=farest){
            count++;
            while(i<arr.length && i<=end){
                farest=Math.max(farest,arr[i++]);
            }

            if(end==farest){
                return -1;
            }
        }
        return count;
    }
}