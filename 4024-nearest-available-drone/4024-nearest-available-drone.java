class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans=-1;
        int len=Integer.MAX_VALUE;
        int n=drones.length;
        for(int i=0;i<n;i++){
            int dist=Math.abs(drones[i][0]-target[0])+ Math.abs(drones[i][1]-target[1]);
            if(dist<=drones[i][2] && dist<len){
                len=dist;
                ans=i;
            }
        }
        return ans;
    }
}