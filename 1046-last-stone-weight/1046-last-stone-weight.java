class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
        for(int s:stones){
            pq.offer(s);
        }
        while(pq.size()!=1){
            int largest=pq.poll();
            int sec=pq.poll();
            pq.offer(largest-sec);
        }
        return pq.poll();
    }
}