package leetcode;

import java.util.HashMap;
import java.util.Map;

public class demo205 {
//    public boolean isIsomorphic(String s, String t) {
//        Map<Character,Character> map=new HashMap<>();
//        if(s.length()!=t.length())return false;
//        for(int i=0;i<s.length();i++){
//            if(!map.containsKey(s.charAt(i))){
//                if(map.containsValue(t.charAt(i)))
//                    return false;
//                else map.put(s.charAt(i),t.charAt(i));
//            }
//            else if(map.get(s.charAt(i))!=t.charAt(i))return false;
//        }
//        return true;
//    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(s.indexOf(a)!=t.indexOf(b))return false;
        }
        return true;
    }
}
