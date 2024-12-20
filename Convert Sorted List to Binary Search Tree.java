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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public TreeNode sortedListToBST(ListNode head)
    {
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val, null, null);
    
        ListNode slow, fast, mid;
        mid= slow= fast= head;
        
        while(fast != null && fast.next != null) 
        {
            mid= slow;
            slow= slow.next;
            fast= fast.next.next;
        }
        mid.next= null;
        
        int data= slow.val;
        
    
        TreeNode left= sortedListToBST(head);
        TreeNode right= sortedListToBST(slow.next);
        
        TreeNode node= new TreeNode(data, left, right);
        
        return node;
    }
}
