package LeetCode;

public class LeetCodeProblem791 {

	public static void main(String[] args)
	{
		System.out.println(customSortString("abcnc","sdsdabcbdk"));
	}
	public static String customSortString(String S, String T) {
        int[] count = new int[26];
        for(char c : T.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray()){
            while(count[c-'a']>0){
                sb.append(c);
                count[c-'a']--;
            }
        }
        for(int i=0;i<26;i++)
        {
            while(count[i]>0){
                sb.append((char)(i+'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }
}
