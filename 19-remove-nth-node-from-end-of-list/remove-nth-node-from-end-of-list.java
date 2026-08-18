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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        //First find the nth node to remove
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n; i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //here slow is the required nth node.

        if(slow==head){
            head=head.next;
        }else{
             //find the node just before the nth node
        ListNode curr = head;
        while(curr.next!=slow){
            curr=curr.next;
        }
        //remove the connections from the curr
        curr.next = slow.next;
        slow.next = null;
        }
       
        return head;
    }
}