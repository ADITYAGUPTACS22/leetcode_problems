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
     public ListNode rotateRight(ListNode head, int k) {
if (head==null || head.next ==null){
    return head;
}
int j = 1;
ListNode d = head;
ListNode temp = head;
while (temp.next!= null){
    j++;
    temp=temp.next;
}
temp.next = head;
head= temp;
int ans = j - k%j;
while (ans>1){
    d=d.next;
    ans--;
}
head= d.next;
d.next = null;

return head;

    }
}
