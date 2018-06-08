package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeProblem15 {

	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int end = nums.length-1;
            int start = i+1;
            while(start<end)
            {
                if(nums[start]+nums[end]+nums[i] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    if(!res.contains(temp))res.add(temp);
                    while(start<end && nums[start] == nums[start+1]) start++;
                    while(start<end && nums[end] == nums[end-1]) end--;
                    start++;
                    end--;
                   
                }
                else if(nums[start]+nums[end]+nums[i] > 0)
                {
                    end--;
                }
                else if(nums[start]+nums[end]+nums[i] < 0){
                    start++;
                }
                
                
            }
        }
        return res;
    }
}
