class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int e=entry.getValue();
            if(e==1){
                return -1;
            }
            ans+=(e+2)/3;
        }
        return ans;
    }
}