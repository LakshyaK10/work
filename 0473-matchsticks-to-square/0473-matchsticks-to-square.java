class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int num:matchsticks){
            sum+=num;
        }
        if(sum%4 !=0){
            return false;
        }
        int[] arr=new int[4];
        int target=sum/4;
        Arrays.sort(matchsticks);
        return solve(matchsticks, matchsticks.length-1 , target, arr);
    }
    public boolean solve(int[] matchsticks, int idx, int target, int[] arr){
        if(idx<0){
            for(int i=0;i<4;i++){
                if(arr[i]!=target){
                    return false;
                }
            }
            return true;
        }

        for(int i=0;i<4;i++){
            if(arr[i]+matchsticks[idx]<=target){
                arr[i]+=matchsticks[idx];
                if(solve(matchsticks, idx-1, target, arr)){
                    return true;
                }
                arr[i]-=matchsticks[idx];
                
            }
        }
        return false;
    }
}