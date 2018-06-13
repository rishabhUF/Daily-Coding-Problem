package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCodeProblem102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
	      
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> res = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                res.add(temp.val);
            }
            result.add(res);
        }
        return result;
    }
}
