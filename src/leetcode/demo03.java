package leetcode;

import org.junit.Test;

import java.util.HashMap;

public class demo03 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int left=0,max=0;
        HashMap<Character,Integer> map=new HashMap();
        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);
            if(map.containsKey(a)){
                left=Math.max(left,map.get(a)+1);
            }
            map.put(a,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    @Test
    public void test(){
        lengthOfLongestSubstring("abcabcbb");
    }
}
