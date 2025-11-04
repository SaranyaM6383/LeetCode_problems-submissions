public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode lista = headA;
          ListNode listb = headB;
            while (lista != listb) {
            lista = (lista != null) ? lista.next : headB;
            listb = (listb != null) ? listb.next : headA;
 */
 *     }
 * }
 *         val = x;
 *         next = null;
 *     ListNode(int x) {
 *     ListNode next;
 *     int val;