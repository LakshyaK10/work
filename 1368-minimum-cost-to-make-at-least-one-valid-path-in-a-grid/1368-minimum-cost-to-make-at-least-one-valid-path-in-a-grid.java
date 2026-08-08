class Solution {
    public int minCost(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] dist=new int[n][m];
        for(int[] rows:dist){
            Arrays.fill(rows,Integer.MAX_VALUE);
        }

        dist[0][0]=0;
        Deque<int[]> dq=new ArrayDeque<>();
        dq.offerFirst(new int[]{0,0});

        int[][] dr={{0,1},{0,-1},{1,0},{-1,0}};

        while(!dq.isEmpty()){
            int[] cur=dq.pollFirst();
            int r=cur[0];
            int c=cur[1];

            for(int i=0;i<4;i++){
                int nr=r+dr[i][0];
                int nc=c+dr[i][1];

                if(nr<0 || nr>=n || nc<0 || nc>=m){
                    continue;
                }

                int cost=(grid[r][c]==i+1)?0:1;

                if(dist[r][c]+cost<dist[nr][nc]){
                    dist[nr][nc]=cost+dist[r][c];

                    if(cost==0){
                        dq.offerFirst(new int[]{nr,nc});
                    }else{
                        dq.offerLast(new int[]{nr,nc});
                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
}