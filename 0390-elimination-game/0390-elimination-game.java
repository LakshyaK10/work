class Solution {
    public int lastRemaining(int n) {
        // boolean order=true;
        // List<Integer> ans=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     ans.add(i);
        // }
        // while(ans.size()>1){
        //     List<Integer> temp=new ArrayList<>();
        //     if(order){
        //         for(int i=1;i<ans.size();i=i+2){
        //             temp.add(ans.get(i));
        //         }
        //     }else{
        //         for(int i=ans.size()-2;i>=0;i=i-2){
        //             temp.add(ans.get(i));
        //         }
        //         Collections.reverse(temp);
        //     }
        //     ans=temp;
        //     order=!order;
        // }
        // return ans.get(0);

        if(n==1){
            return 1;
        }
        return 2*(n/2+1 - lastRemaining(n/2));
    }
}