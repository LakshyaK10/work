class Solution {
    public String[] createGrid(int m, int n) {
        // String[] ans=new String[m];
        // StringBuilder ans1=new StringBuilder();
        // for(int i=0;i<n;i++){
        //     ans1=ans1.append('.');
        // }
        // ans[0]=ans1.toString();
        // for(int i=1;i<m;i++){
        //     StringBuilder str=new StringBuilder();
        //     for(int j=0;j<n-1;j++){
        //         str=str.append('#');
        //     }
        //     str=str.append('.');
        //     ans[i]=str.toString();
        // }
        // return ans;

        char[][] graph=new char[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(graph[i],'#');
        }

        for(int i=0;i<n;i++){
            graph[0][i]='.';
        }

        for(int i=1;i<m;i++){
            graph[i][n-1]='.';
        }

        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            ans[i]=new String(graph[i]);
        }
        return ans;
    }
}