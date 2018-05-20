import java.util.Arrays;

/*
 Given an array of integers, return a new array such that each element at index i 
 of the new array is the product of all the numbers in the original array except the one at i.

 For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
 If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 */
public class Problem2 {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int[] newArray = solution(arr);
		print(newArray);
	}
	
	//solution
	//product of array except self
	// extra space, O(n) time complexity
	public static int[] solution(int[] arr){
		int[] result = new int[arr.length];
		Arrays.fill(result, 1);
		for(int i=1;i<arr.length;i++)
		{
			result[i] = result[i-1]*arr[i-1];
		}
		for(int i=arr.length-2;i>=0;i--){
			result[i] = result[i]*arr[i+1];
			arr[i] = arr[i]*arr[i+1];
		}
		return result;
	}
	
	//print the array
	public static void print(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
