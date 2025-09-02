            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        return res.next;        
    }
}