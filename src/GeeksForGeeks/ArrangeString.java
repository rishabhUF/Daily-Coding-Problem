package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

/*
Given a String s and int r , first fill each character row wise and print column wise.
for e.g. String s = “abcdefgh” and r = 3
so filling column wise would give :
a d g
b e h
c f
 */
public class ArrangeString {

	public static void main(String[] args){
		System.out.print(arrange("abcdefgh",3));
	}
	
	static String arrange(String s, int n){
		
		int i = 0;
		List<String> res = new ArrayList<>();
		while(i<n){
			String temp = "";
			for(int j=i;j<s.length();j = j+n){
				temp += s.charAt(j);
			}
			i++;
			res.add(temp);
		}
		String result = "";
		i =0;
		while(i<n){
			result += res.get(i);
			i++;
		}
		return result;
	}
}
