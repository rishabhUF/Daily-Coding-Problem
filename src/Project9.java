/*
 Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
 Numbers can be 0 or negative.
 For example, [2, 4, 6, 8] should return 12, since we pick 4 and 8. 
 [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 
 */
public class Project9 {

	public static void main(String[] args)
	{
		int[] arr = {5,  5, 10, 40, 50, 35};
		int[] arr2 = {1, 20, 3};
		int[] arr3 = {5, 5, 10, 100, 10, 5};
		System.out.println(solution(arr3));
	}
	
	public static int solution(int[] arr){
		int n = arr.length;
		int includingSum = arr[0];
		int prevIncludingSum = 0;
		int excludingSum = 0;
		for(int i=1;i<n;i++)
		{
			includingSum = excludingSum + arr[i];
			excludingSum = Math.max(excludingSum, prevIncludingSum);
			prevIncludingSum = includingSum;
		}
		return Math.max(includingSum, excludingSum);
	}
}
