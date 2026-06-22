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
    public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);

    List<Integer> level = new ArrayList<>();

    while (!queue.isEmpty()) {
        TreeNode currNode = queue.poll();

        if (currNode == null) {
            result.add(level);           
            level = new ArrayList<>();   

            if (!queue.isEmpty()) {
                queue.add(null);
            }
        } else {
            level.add(currNode.val);

            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }
    return result;
}
}
