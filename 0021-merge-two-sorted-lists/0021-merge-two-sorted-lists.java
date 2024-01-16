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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // if(l1.next == null || l2.next == null)
        //     return l1.next == null ? l2 : l1;
            
        ListNode temp_node = new ListNode();
        ListNode curr_node = temp_node;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr_node.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr_node.next = l2;
                l2 = l2.next;
            }
            
            curr_node = curr_node.next;
        }
        
        if(l1 != null)
        {
            curr_node.next = l1;
            l1 = l1.next;
        }
        
        if(l2 != null)
        {
            curr_node.next = l2;
            l2 = l2.next;
        }
        return temp_node.next;
    }
}