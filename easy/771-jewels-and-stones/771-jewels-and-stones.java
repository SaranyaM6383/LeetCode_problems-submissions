  private Integer pred = null;
  private void inorder(TreeNode root) 
  {
    if (root == null)
      return;
    inorder(root.left);
    if (pred != null)
      ans = Math.min(ans, root.val - pred);
    pred = root.val;
    inorder(root.right);
  }
}