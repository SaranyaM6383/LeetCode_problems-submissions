        if (node == null)
            return;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }
}