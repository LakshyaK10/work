class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;

        int[] cost=new int[n];
        Arrays.fill(cost,1);

        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                cost[i]=cost[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                cost[i]=Math.max(cost[i],cost[i+1]+1);
            }
        }
        int sum=0;
        for(int c:cost){
            sum+=c;
        }
        return sum;
    }
}