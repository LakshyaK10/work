class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();

        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        q.offer(0);
        // vis[0]=true;


        while(!q.isEmpty()){
            int cur=q.poll();
            vis[cur]=true;

            for(int room:rooms.get(cur)){
                if(!vis[room]){
                    q.offer(room);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                return false;
            }
        }
        return true;
    }
}