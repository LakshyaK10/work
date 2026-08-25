class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int m=k;
        while(true){
            if(!set.contains(m)){
                return m;
            }
            m +=k;
        }
    }
}