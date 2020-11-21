package leetcode;

import java.util.HashMap;

public class demo290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] str=s.split(" ");
        if(pattern.length()!=str.length)return false;
        for(int i=0;i<pattern.length();i++){
            Character c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(str[i]))return false;
            }else if(map.containsValue(str[i])){
                return false;
            }else{
                map.put(c,str[i]);
            }
        }
        return true;
    }
}
