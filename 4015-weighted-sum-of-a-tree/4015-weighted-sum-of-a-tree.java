class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        // int n=parent.length;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(0,1);
        // int maxHeight=1;

        // for(int i=1;i<n;i++){
        //     int par=map.get(parent[i]);
        //     map.put(i,par+1);
        //     maxHeight=Math.max(maxHeight,par+1);
        // }

        // // int maxHeight=map.get(n-1);
        // long ans=0;
        // for(int i=0;i<n;i++){
        //     long sum=(long)nums[i]*(maxHeight-map.get(i)+1);
        //     ans+=sum;
        // }
        // System.out.println(maxHeight);
        // return ans;
        

        int n=parent.length;
        List<List<Integer>> children =new ArrayList<>();

        for(int i=0;i<n;i++){
            children.add(new ArrayList<>());
        }

        for(int i=1;i<n;i++){
            children.get(parent[i]).add(i);
        }

        int[] height=new int[n];
        height[0]=1;

        Queue<Integer> q=new LinkedList<>();
        q.offer(0);

        int h=1;
        while(!q.isEmpty()){
            int cur=q.poll();

            for(int child:children.get(cur)){
                height[child]=height[cur]+1;
                h=Math.max(h,height[child]);
                q.offer(child);
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            long sum=(long)nums[i]*(h-height[i]+1);
            ans+=sum;
        }
        return ans;
    }
}