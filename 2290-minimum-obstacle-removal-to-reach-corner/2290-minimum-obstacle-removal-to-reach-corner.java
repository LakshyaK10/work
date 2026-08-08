class Solution {
    public int minimumObstacles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] dist=new int[n][m];
        for(int[] rows:dist){
            Arrays.fill(rows,Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[2]-b[2]);
        pq.offer(new int[]{0,0,0});

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        int count=0;

        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int r=cur[0];
            int c=cur[1];
            int d=cur[2];

            if(d>dist[r][c]){
                continue;
            }

            if(r==n-1 && c==m-1){
                return d;
            }

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];

                if(nr>=n || nr<0 || nc>=m || nc<0){
                    continue;
                }
                
                int newd=d+grid[nr][nc];
                if(newd<dist[nr][nc]){
                    dist[nr][nc]=newd;
                    pq.offer(new int[]{nr,nc,newd});
                }
                // if(grid[nr][nc]==1){
                //     pq.offer(new int[]{nr,nc,d+1});
                // }else if(grid[nr][nc]==0){
                //     pq.offer(new int[]{nr,nc,d});
                // }
            }
        }
        return -1;
    }
}