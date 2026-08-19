class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n=monsters.length;
        long[] diff=new long[n+1];
        
        for(int[] b:boosts){
            int l=b[0];
            int r=b[1];
            int c=b[2];
            diff[l]+=c;
            diff[r+1]-=c;
        }

        long[] bonus=new long[n];
        long cur=0;
        for(int i=0;i<n;i++){
            cur+=diff[i];
            bonus[i]=cur;
        }

        long low=0;
        long high=0;
        for(int num:monsters){
            high+=num;
        }

        while(low<high){
            long mid=low+(high-low)/2;

            if(canDefeat(monsters, bonus, mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canDefeat(int[] monsters , long[] bonus, long power){
        
        for(int i=0;i<monsters.length;i++){
            if(power+bonus[i]<monsters[i]){
                return false;
            }

            power-=monsters[i];
            if(power<0){
                power=0;
            }
        }
        return true;
    }
}