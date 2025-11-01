        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            while(curr.next!=null && mpp.contains(curr.next.val)){
                curr.next=curr.next.next;
            }
            curr=curr.next;
        while(head!=null && mpp.contains(head.val)) head=head.next;
        for(int x:nums) mpp.add(x);
        java.util.HashSet<Integer> mpp=new java.util.HashSet<>();
    public ListNode modifiedList(int[] nums, ListNode head) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     ListNode(int val) { this.val = val; }
 *     ListNode() {}