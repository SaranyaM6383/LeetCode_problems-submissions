class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            total = carry;
            if (l1 != null) {
                total += l1.val;