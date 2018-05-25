package DailyChallenge;
/*
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
   In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates 
   and negative numbers as well.
   For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */
public class Problem4 {
	
	public static void main(String[] args){
		
	}
	
	public static int solution(int[] arr){
		if(arr == null || arr.length == 0)
			return 1;
		
		int index = 0;
		while(index < arr.length){
			int temp = arr[index];
			//if number is not at its position. 
			if(temp != index+1){
				if(temp >=1 && temp <= arr.length){
					//swap the two numbers
					
				}
			}
		}
	}
	

}
