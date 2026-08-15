class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int e=entry.getValue();
            if(e==1){
                return -1;
            }
            count=count+e/3;
            if(e%3!=0){
                count++;
            }
        }
        return count;
    }
}