package LeetCode;

public class LeetCodeProblem98 {

	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return validBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean validBST(TreeNode root, long min, long max)
    {
        if(root.val <= min || root.val >= max) return false;
        boolean left = true, right = true;
        if(root.left!= null) left = validBST(root.left,min,root.val);
        if(root.right!=null) right = validBST(root.right,root.val,max);
        return  left && right; 
    }
}
