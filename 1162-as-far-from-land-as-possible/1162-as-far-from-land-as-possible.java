class Solution {
    public int maxDistance(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.offer(new int[]{i,j,0});
                }
            }
        }

        if(q.isEmpty() || q.size()==n*n){
            return -1;
        }

        int[] dr={1,-1,0,0};
        int[] dc={0,0,1,-1};
        int time=0;

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int t=cur[2];

            time=Math.max(t,time);
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0){
                    grid[nr][nc]=1;
                    q.offer(new int[]{nr,nc,t+1});
                }
            }
        }
        return time;
    }
}