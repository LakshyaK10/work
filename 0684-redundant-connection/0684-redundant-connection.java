class Solution {
    int[] parent;
    int[] rank;

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        rank=new int[n+1];

        for(int i=0;i<=n;i++){
            parent[i]=i;
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            if(find(u)==find(v)){
                return e;
            }
            union(u,v);
        }
        return new int[]{};
    }
    public int find(int x){
        if(parent[x]!=x){
            return find(parent[x]);
        }
        return parent[x];
    }
    public void union(int a, int b){
        int pa=find(a);
        int pb=find(b);

        if(pa==pb){
            return;
        }
        if(rank[pa]<rank[pb]){
            parent[pa]=pb;
        }else if(rank[pa]>rank[pb]){
            parent[pb]=pa;
        }else{
            parent[pa]=pb;
            rank[pa]++;
        }
    }
}