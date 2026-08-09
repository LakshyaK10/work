class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n=prices.length-1;
        int m=discounts.length-1;
        double sum=0;
        int dis=0;
        
        while(n>=0){
            int price=prices[n];
            if(m<0){
                dis=0;
            }else{
                dis=discounts[m];
            }
            sum=sum+(price*(100-dis)/100.0);
            n--;
            m--;
        }
        return sum;
    }
}