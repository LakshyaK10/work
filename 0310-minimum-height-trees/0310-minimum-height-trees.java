class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1){
            return Arrays.asList(0);
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree=new int[n];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
            indegree[u]++;
            indegree[v]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1){
                q.offer(i);
            }
        }


        int remaining=n;
        while(remaining>2){
            int size=q.size();
            remaining=remaining-size;

            while(size!=0){
                int cur=q.poll();
                for(int neigh:adj.get(cur)){
                    indegree[neigh]--;

                    if(indegree[neigh]==1){
                        q.offer(neigh);
                    }
                }
                size--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int cur=q.poll();
            ans.add(cur);
        }
        return ans;
    }
}