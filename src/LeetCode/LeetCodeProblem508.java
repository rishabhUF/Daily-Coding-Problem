package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class LeetCodeProblem508 {

	Map<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
       if(root == null){
            return new int[0];    
       }
        
        int finalValue = findSum(root);
        //System.out.println(map.size());
        
        int max = 0;
        for(int key : map.keySet())
        {
          // System.out.println(map.get(key) + " " + key); 
            if(max < map.get(key)){
                max = map.get(key);
            }
        }
        List<Integer> list = new ArrayList<>();
        //System.out.println(max);
        for(int key : map.keySet())
        {
            if(max == map.get(key)){
               list.add(key);
                
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
    
    int findSum(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            if(map.containsKey(root.val))
                map.put(root.val,map.get(root.val)+1);
            else
                map.put(root.val,1);
            return root.val;
        }
        
        int left = 0, right = 0,res=0;
        if(root.left!= null){
            left = findSum(root.left);
        }
        if(root.right!= null){
            right = findSum(root.right);
        }
        res = left+right+root.val;
        if(map.containsKey(res))
            map.put(res,map.get(res)+1);
        else
            map.put(res,1);
        return res;
    }
}
