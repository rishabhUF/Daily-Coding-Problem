package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeProblem763 {

	public static void main(String[] args){
		
	}
	public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        if(s == null || n == 0) return result;
        int[] index = new int[26];
        // mapped the last index of the that char
        for(int i=0;i<n;i++){
            index[s.charAt(i)-'a'] = i;
        }
        int start = 0;
        int last = 0;
        for(int i=0;i<n;i++)
        {
            last = Math.max(last,index[s.charAt(i)-'a']);
            if(last == i){
                result.add(last-start+1);
                start = last+1;
            }
        }
        return result;
    }
}
