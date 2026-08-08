class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        int ans=0;
        boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++){
            int u=-1;
            for(int j=0;j<n;j++){
                if(!vis[j] && (u==-1 || dist[j]<dist[u])){
                    u=j;
                }
            }
            vis[u]=true;
            ans=ans+dist[u];

            for(int v=0;v<n;v++){
                if(!vis[v]){
                    int cost=Math.abs(points[u][0]-points[v][0])+Math.abs(points[u][1]-points[v][1]);

                    if(cost<dist[v]){
                        dist[v]=cost;
                    }
                }
            }
        }
        return ans;
    }
}