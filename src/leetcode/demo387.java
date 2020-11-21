package leetcode;

public class demo387 {
    public int firstUniqChar(String s) {
        int len=s.length();
        if(len==0)return -1;
        int[] map=new int[26];
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            map[c-'a']++;
        }
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(map[c-'a']==1)return i;
        }
        return -1;
    }
}
