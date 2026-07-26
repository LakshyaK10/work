class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int i=0;
        int j=0;
        int n=series1.length;
        int m=series2.length;

        List<List<Integer>> ans=new ArrayList<>();
        while(i<n && j<m){
            int ts;

            if(series1[i][0]<=series2[j][0]){
                ts=series1[i][0];
            }else{
                ts=series2[j][0];
            }

            int v1=(i<n)? series1[i][1]:0;
            int v2=(j<m)? series2[j][1]:0;

            ans.add(Arrays.asList(ts,v1+v2));

            if(i<n && ts==series1[i][0]){
                i++;
            }
            if(j<m && ts==series2[j][0]){
                j++;
            }
        }

        while(i<n){
            ans.add(Arrays.asList(series1[i][0],series1[i][1]));
            i++;
        }

        while(j<m){
            ans.add(Arrays.asList(series2[j][0],series2[j][1]));
            j++;
        }
        return ans;
    }
}