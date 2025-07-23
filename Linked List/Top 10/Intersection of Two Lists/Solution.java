class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

       while(temp1 != temp2) {
        temp1 = temp1 != null ? temp1.next : headB;
        temp2 = temp2 != null ? temp2.next : headA;
       }
       return temp1;
    }
}