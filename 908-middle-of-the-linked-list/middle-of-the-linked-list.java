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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();

        ListNode curr = head;

        while(curr!=null){
            nodes.add(curr);
            curr = curr.next;
        }
    
    int len = nodes.size();
    return head=nodes.get(len/2);
    }
}