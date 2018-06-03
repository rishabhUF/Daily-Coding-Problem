package LeetCode;
// 55. Jump Game
public class LeetCodeProblem55 {

	public static boolean canJump(int[] nums) {
        if(nums == null)
            return true;
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max){
                return false;
            }
            max = Math.max(max,nums[i]+i);
        }
        return true;
    }
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		System.out.println(canJump(arr));
	}
}
