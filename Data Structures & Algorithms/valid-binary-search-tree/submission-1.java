/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
      public boolean isValidBST(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    inOrder(root, list);

    if (list.size() == 0) return true;

    int prev = list.get(0);

    for (int i = 1; i < list.size(); i++) {
        int curr = list.get(i);

        if (curr <= prev) {
            return false;  
        }
        prev = curr;
    }
    return true;
}

private void inOrder(TreeNode root, List<Integer> list) {
    if (root == null) return;

    inOrder(root.left, list);
    list.add(root.val);
    inOrder(root.right, list);
}

}
