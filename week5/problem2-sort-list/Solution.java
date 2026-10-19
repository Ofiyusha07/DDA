
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode before = null;

        while (fast != null && fast.next != null) {
            before = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        before.next = null;

        ListNode first = sortList(head);
        ListNode second = sortList(slow);

        ListNode start = new ListNode(0);
        ListNode end = start;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                end.next = first;
                first = first.next;
            } else {
                end.next = second;
                second = second.next;
            }

            end = end.next;
        }

        if (first != null) {
            end.next = first;
        } else {
            end.next = second;
        }

        return start.next;
    }
}
