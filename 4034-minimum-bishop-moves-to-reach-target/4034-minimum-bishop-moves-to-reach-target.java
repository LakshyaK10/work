class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sum1=source[0]+source[1];
        int sum2=target[0]+target[1];
        int dif1=source[0]-source[1];
        int dif2=target[0]-target[1];


        if((sum1%2==0 && sum2%2==1) || (sum1%2==1 && sum2%2==0)){
            return -1;
        }

        if(sum1==sum2 || dif1==dif2){
            return 1;
        }
                
        return 2;
    }
}