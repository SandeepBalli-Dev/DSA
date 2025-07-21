class ListNode {
    int val;
    ListNode next;

    public ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = reverseList(slow);
        while(secondHead != null && head != null) {
            if(secondHead.val != head.val) {
                return false;
            }
            secondHead = secondHead.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}