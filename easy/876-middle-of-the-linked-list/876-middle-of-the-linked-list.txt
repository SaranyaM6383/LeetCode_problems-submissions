    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(s != null && s.next != null){
            f=f.next;
        }
            s=s.next.next;
        return f;
class Solution {
 */