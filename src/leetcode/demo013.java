package leetcode;

import java.util.HashMap;

public class demo013 {
    public int romanToInt1(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('M',1000);map.put('D',500);map.put('C',100);
        map.put('L',50);map.put('X',10);map.put('V',5);map.put('I',1);
        int res=0;
        int pre=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int temp=map.get(s.charAt(i));
            if(pre<temp){
                res-=pre;
            }else{
                res+=pre;
            }
            pre=temp;
        }
        return res+pre;
    }

    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);map.put("IV", 4);map.put("V", 5);map.put("IX", 9);map.put("X", 10);
        map.put("XL", 40);map.put("L", 50);map.put("XC", 90);map.put("C", 100);map.put("CD", 400);
        map.put("D", 500);map.put("CM", 900);map.put("M", 1000);
        int ans = 0;
        for(int i = 0;i < s.length();) {
            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i+1));
                i ++;
            }
        }
        return ans;
    }
}
