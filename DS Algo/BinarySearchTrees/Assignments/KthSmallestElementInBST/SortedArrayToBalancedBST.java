/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {

    private int counter=0;
    private static int ans=-1;

    public int kthsmallest(TreeNode A, int B) {
        inorderSolution(A,B);
        return ans;
    }

    private void inorderSolution(TreeNode node, int B){
        if(node == null) return;

        // Process Left node
        inorderSolution(node.left,B);

        // Process root node:
        counter++;
        if(counter == B) {
            ans = node.val;
            return;
        }

        // Process right node:
        inorderSolution(node.right,B);
    }
}
