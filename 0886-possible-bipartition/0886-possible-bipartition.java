class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] d:dislikes){
            int u=d[0];
            int v=d[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color=new int[n+1];
        Arrays.fill(color,-1);
        
        

        for(int i=1;i<=n;i++){
            if(color[i]!=-1){
                continue;
            }
            Queue<Integer> q=new LinkedList<>();
            color[i]=0;
            q.offer(i);

            while(!q.isEmpty()){
                int cur=q.poll();
                for(int neigh:adj.get(cur)){
                    if(color[neigh]==-1){
                        color[neigh]=1-color[cur];
                        q.offer(neigh);
                    }else if(color[neigh]==color[cur]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}