class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;

        //pacific (n,-1) and (-1,m);
        //atlantic (n,m+1) and(n+1,m)

        List<List<Integer>> ans=new ArrayList<>();
        boolean[][] pacific=new boolean[n][m];
        boolean[][] atlantic=new boolean[n][m];

        for(int i=0;i<n;i++){
            dfs(i,0,pacific,heights);
        }

        for(int i=0;i<m;i++){
            dfs(0,i,pacific,heights);
        }

        for(int i=0;i<m;i++){
            dfs(n-1,i,atlantic,heights);
        }
        for(int i=0;i<n;i++){
            dfs(i,m-1,atlantic,heights);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public void dfs(int i, int j, boolean[][] vis, int[][] heights){
        int n=heights.length;
        int m=heights[0].length;
        if(vis[i][j]){
            return;
        }

        vis[i][j]=true;

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        for(int k=0;k<4;k++){
            int nr=i+dr[k];
            int nc=j+dc[k];

            if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && heights[nr][nc]>=heights[i][j]){
                dfs(nr,nc,vis,heights);
            }
        }

    } 
}