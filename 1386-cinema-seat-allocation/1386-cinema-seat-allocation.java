class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int[] cur=reservedSeats[i];
            int u=cur[0];
            int v=cur[1];
            map.putIfAbsent(u,new HashSet<>());
            map.get(u).add(v);
        }
        int count=2*n;
        for(int r:map.keySet()){
            HashSet<Integer> seat=map.get(r);
            boolean left=true;
            boolean mid=true;
            boolean right=true;

            for(int i=2;i<=5;i++){
                if(seat.contains(i)){
                    left=false;
                    break;
                }
            }

            for(int i=4;i<=7;i++){
                if(seat.contains(i)){
                    mid=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(seat.contains(i)){
                    right=false;
                    break;
                }
            }
           
            if(left && right){
                count=count;
            }else if(left || mid || right){
                count--;
            }else{
                count=count-2;;
            }
            
        }
        return count;
    }
}