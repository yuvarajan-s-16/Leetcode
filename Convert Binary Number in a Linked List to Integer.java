class Solution {
    public int getDecimalValue(ListNode head) {
        int result = head.val;
        while (head.next != null) {
            result = (result << 1) | head.next.val;
            head = head.next;
        }
        return result;
    }
}
