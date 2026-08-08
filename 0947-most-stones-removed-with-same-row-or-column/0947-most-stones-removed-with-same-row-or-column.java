class Solution {
    class DSU{
        int[] parent;
        int[] rank;

        DSU(int n){
            parent=new int[n];
            rank=new int[n];

            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }

        int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int x,int y){
            int px=find(x);
            int py=find(y);

            if(px==py){
                return false;
            }

            if(rank[px]<rank[py]){
                parent[px]=py;
            }else if(rank[px]>rank[py]){
                parent[py]=px;
            }else{
                parent[py]=px;
                rank[px]++;
            }
            return true;
        }
    }
    public int removeStones(int[][] stones) {
        int n=stones.length;

        int components=n;
        DSU dsu=new DSU(n);

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    if(dsu.union(i,j)){
                        components--;
                    }
                }
            }
        }
        return n-components;
    }
}