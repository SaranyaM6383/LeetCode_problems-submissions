 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)return false;
        if(set.contains(k - root.val)) return true;
 *         this.left = left;
    HashSet<Integer> set=new HashSet<>();
        set.add(root.val);
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}