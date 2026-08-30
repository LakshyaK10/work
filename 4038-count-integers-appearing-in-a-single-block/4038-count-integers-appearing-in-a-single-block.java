class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        HashSet<Integer> map1=new HashSet<>();

        int prev=-1;

        for(int num:nums){
            if(map.contains(num) && prev!=num){
                map1.add(num);
            }
            map.add(num);
            prev=num;
        }
        return map.size()-map1.size();
    }
}