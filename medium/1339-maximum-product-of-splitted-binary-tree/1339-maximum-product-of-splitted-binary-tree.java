            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return (int)(ans % MOD);
    }
}