class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] cur:invocations){
            int u=cur[0];
            int v=cur[1];
            adj.get(u).add(v);
        }
        boolean[] sus=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(k);
        sus[k]=true;

        while(!q.isEmpty()){
            int cur=q.poll();
            for(int a:adj.get(cur)){
                
                if(!sus[a]){
                    sus[a]=true;
                    q.offer(a);
                }
            }
        }
        for(int[] inv:invocations){
            int u=inv[0];
            int v=inv[1];
            if(!sus[u] && sus[v]){
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++){
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!sus[i]){
                ans.add(i);
            }
        }
        return ans;

    }
}