            cur = cur.next;
        }
        cur.next = (list1 != null) ? list1 : list2;
        return dummy.next;        
    }
}