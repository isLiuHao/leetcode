package leetcode;

import java.util.HashMap;
import java.util.Map;

public class demo383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map=new int[27];
        for( int i=0;i<magazine.length();i++){
            map[magazine.charAt(i)-'a']++;
        }
        for( int i=0;i<ransomNote.length();i++){
            if(--map[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }
}
