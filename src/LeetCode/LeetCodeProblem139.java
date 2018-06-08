package LeetCode;

import java.util.List;

public class LeetCodeProblem139 {

	boolean res = false;
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null)
            return false;
        breakUtils(s,wordDict);
        return res;
    }
    
    void breakUtils(String s, List<String> wordDict)
    {
        for(int i=0;i<=s.length();i++){
            String temp = s.substring(0,i);
            if(wordDict.contains(temp))
            {
                if(temp.length() == s.length())
                {
                    res = true;
                    return;
                }
                else
                {
                    breakUtils(s.substring(i, s.length()), wordDict);
                }
            }
        }
    }   
}
