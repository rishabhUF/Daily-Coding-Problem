package LeetCode;

public class LeetCodeProblem3 {

	public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, res = 0;
       HashMap<Character, Integer> map = new HashMap<>();
       while (end < s.length()){
           while (end < s.length()){
               char cur = s.charAt(end);
               map.put(cur, map.getOrDefault(cur, 0) + 1);
               end++;
               if (map.get(cur) > 1){
                   break;
               }
               else{
                   res = Math.max(res, end - start);
               }
           }
           while (end < s.length() && start < end){
               char cur = s.charAt(start);
               start++;
               if (map.get(cur) == 1)
                   map.remove(cur);
               else{
                   map.put(cur, 1);
                   break;
               }
           }
       }
       return res;
	}
	
	public static void main(String[] args){
		
	}
}
