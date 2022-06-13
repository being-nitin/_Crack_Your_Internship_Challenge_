/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // we will use floyd's cycle algorythm to find that it has cycle or not.
        // we will take two pointers and the moment when they both will become equal 
            // that means it has a loop
        if(head==null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow!=fast){
            slow = slow.next;
            if(fast!=null && fast.next!=null){
            fast = fast.next.next;
        }
            else{
                return false;
            }
        }
        return true;
    }
}