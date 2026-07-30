class Solution {
    class Pair{
        int val;
        int row;
        int idx;

        Pair(int val,int row,int idx){
            this.val=val;
            this.row=row;
            this.idx=idx;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int max=Integer.MIN_VALUE;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> a.val-b.val);
        for(int i=0;i<nums.size();i++){
            pq.offer(new Pair(nums.get(i).get(0), i,0));
            if(max<nums.get(i).get(0)){
                max=nums.get(i).get(0);
            }
        }

        int start=0;
        int end=Integer.MAX_VALUE;
        while(pq.size()==nums.size()){
            Pair cur=pq.poll();
            int min=cur.val;

            if(max-min< end-start){
                start=min;
                end=max;
            }

            if(cur.idx +1==nums.get(cur.row).size()){
                break;
            }

            int next=nums.get(cur.row).get(cur.idx+1);
            pq.offer(new Pair(next, cur.row,cur.idx+1));
            max=Math.max(max, next);
        }

        return new int[]{start,end};
    }
}