class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int i=0;
        int[] ans=new int[n];
        while(!map.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>(map.keySet());
            Collections.sort(arr);
            for(int cur:arr){
                ans[i++]=cur;
                int freq=map.get(cur);
                if(freq==1){
                    map.remove(cur);
                }else{
                    map.put(cur,freq-1);
                }
            }
        }
        return ans;

    }
}