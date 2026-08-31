/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int i=1;
        
        ListNode prev=head;
        ListNode cur=head.next;
        ListNode nxt=head.next.next;

        while(nxt!=null){
            if(isValid(prev,cur,nxt)){
                if(start==0){
                    start=i;
                }else{
                    min=Math.min(min,i-end);
                }
                end=i;
            }
            prev=cur;
            cur=nxt;
            nxt=nxt.next;
            i++;
        }
        if(start==end){
            return new int[]{-1,-1};
        }
        return new int[]{min, end-start};

    }
    public boolean isValid(ListNode prev, ListNode cur, ListNode nxt){
        return (prev.val<cur.val && cur.val>nxt.val) || (prev.val>cur.val && cur.val<nxt.val);
    }
}