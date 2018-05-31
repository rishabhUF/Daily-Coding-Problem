package LeetCode;

public class LeetCodeProblem11 {

	 public static int maxArea(int[] height) {
	        int area = 0;
	        int left = 0, right = height.length-1;
	        while(left<right)
	        {
	            int h = Math.min(height[left], height[right]);
	            area = Math.max(area, (right - left)*h);
	            while(height[left] <= h && left < right) left++;
	            while(height[right] <= h && left<right) right--;
	        }
	        return area;
	    }
	 public static void main(String[] args)
	 {
		 int[] arr = {1,2};
		 System.out.println(maxArea(arr));
	 }
}
