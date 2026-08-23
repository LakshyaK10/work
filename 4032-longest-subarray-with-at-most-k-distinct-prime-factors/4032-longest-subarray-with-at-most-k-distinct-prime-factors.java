class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;

        int left=0;
        for(int right=0;right<nums.length;right++){
            solve(nums[right], map);
            while(map.size()>k){
                remove(nums[left],map);
                left++;
            }
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
    public void solve(int n, HashMap<Integer,Integer> map){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                map.put(i,map.getOrDefault(i,0)+1);
                
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n>1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
    }

    public void remove(int n,HashMap<Integer,Integer> map){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                map.put(i,map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }

                while(n%i==0){
                    n=n/i;
                }
            }

        }
        if(n>1){
                map.put(n,map.get(n)-1);
                if(map.get(n)==0){
                    map.remove(n);
                }
            }
    }
}






