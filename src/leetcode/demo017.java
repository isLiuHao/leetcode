package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo017 {
    public List<String> letterCombinations(String digits) {
        List<String> str=new ArrayList<>();
        int len=digits.length();
        if(len==0)return str;
        Map<Character, String> phoneMap = new HashMap<>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(str,phoneMap,digits,0,new StringBuffer());
        return str;
    }
    public void backtrack(List<String> str,Map<Character, String> phoneMap,String digits,int index,StringBuffer buffer){
        if(index==digits.length())
            str.add(buffer.toString());
        else {
            char a=digits.charAt(index);
            String ss=phoneMap.get(a);
            for(int i=0;i<ss.length();i++){
                buffer.append(ss.charAt(i));
                backtrack(str,phoneMap,digits,index+1,buffer);
                buffer.deleteCharAt(index);
            }
        }
    }
}
