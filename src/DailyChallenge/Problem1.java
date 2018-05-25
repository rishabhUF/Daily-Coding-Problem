package DailyChallenge;
import java.util.HashMap;

/*
  Given a list of numbers, return whether any two sums to k.

  For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
  */
public class Problem1 {

	public static void main(String[] args)
	{
		int[] arr = {10,15,3,7};
		System.out.println(solution(arr,0));
	}
	
	public static boolean solution(int[] arr,int sum)
	{
		if(arr.length == 0 || arr == null || sum == 0)
			return true;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]) && sum-arr[i]>0){
				map.put(sum-arr[i], arr[i]);
			}
			else if(map.containsKey(arr[i]))
				return true;
		}
		return false;
	}
}
