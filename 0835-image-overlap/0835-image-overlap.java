class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int count=0;
        int max=0;
        int n=img1.length;

        for(int x=-n+1;x<=n-1;x++){
            for(int y=-n+1;y<=n-1;y++){
                count=0;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        int c=0;
                        if(x+i>=0 && x+i<n && y+j>=0 && y+j<n){
                            c=img1[x+i][y+j];
                        }
                        count=count+(img2[i][j]&c);
                    }
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}