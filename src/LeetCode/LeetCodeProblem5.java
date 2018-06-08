package LeetCode;

public class LeetCodeProblem5 {

	int maxLen, lo;
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return "";
        if(s.length() < 1)
            return s;
        String res = "";
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxLen);
    }
    
    public void palindrome(String s, int start, int end){
        while(start>= 0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(maxLen < end - start - 1) {
		    lo = start + 1;
	    	maxLen = end - start - 1;
	    }
    }
}
