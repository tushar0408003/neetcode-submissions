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
  public int goodNodes(TreeNode root) {
           return goodCount(root, root.val);

        }
        private int goodCount(TreeNode root , int val){

            if(root == null){
                return 0;
            }
            int count = 0;

            if (root.val >= val){
                count = 1;
                val = root.val;

            }

            count += goodCount(root.left, val);
            count +=  goodCount(root.right, val);

            return count;
        }
}
