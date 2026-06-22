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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

           HashMap<Integer, Integer> InOrderMap = new HashMap<>();

           for(int i =0; i< preorder.length; i++){
                InOrderMap.put(inorder[i], i);
           }

            return splitTree(preorder, InOrderMap, 0 ,0, inorder.length-1);

        }
        private TreeNode splitTree(int [] preorder , HashMap<Integer, Integer> InorderIndexMap, int rootIndex, int left , int right){

            TreeNode root = new TreeNode(preorder[rootIndex]);

            int mid = InorderIndexMap.get(preorder[rootIndex]);

            if (mid >left){
                root.left = splitTree(preorder, InorderIndexMap, rootIndex +1, left, mid-1);
            }
            if (mid< right){
                root.right = splitTree(preorder, InorderIndexMap, rootIndex+mid -left+1, mid+1, right );
            }
            return root;
        }
}
