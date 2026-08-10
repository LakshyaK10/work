class Solution {
    public boolean judgeSquareSum(int c) {
        int low=0;
        int high=(int)Math.sqrt(c);

        while(low<=high){
            long sum=(long)low*low+(long)high*high;

            if(sum==c){
                return true;
            }else if(sum<c){
                low=low+1;
            }else{
                high--;
            }
        }
        System.out.println(high);
        return false;
    }
}