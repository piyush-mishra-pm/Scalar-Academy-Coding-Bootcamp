public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return solve(A,0,A.length-1);
    }

    private TreeNode solve(final int[] A, int start, int end){
        if(start>end){
            return null;
        }

        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(A[mid]);

        root.left = solve(A,start,mid-1);
        root.right = solve(A,mid+1,end);

        return root;
    }
}