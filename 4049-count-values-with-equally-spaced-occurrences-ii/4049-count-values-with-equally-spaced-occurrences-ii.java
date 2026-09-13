class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int count=0;
        for(ArrayList<Integer> list:map.values()){
            if(list.size()<3){
                continue;
            }
            int diff=list.get(1)-list.get(0);
            boolean same=true;

            for(int i=2;i<list.size();i++){
                int newDiff=list.get(i)-list.get(i-1);
                if(newDiff!=diff){
                    same=false;
                    break;
                }
            }
            if(same){
                count++;
            }
        }
        return count;
    }
}