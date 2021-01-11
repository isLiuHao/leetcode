package leetcode;

import org.junit.Test;

public class demo028 {
    @Test
    public  void test() {
        String st1="mississippi";
        String st2="issip";
        System.out.println(strStr(st1,st2));
    }
    public int strStr1(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len2==0)return 0;
        int j,i;
        for(i=0;i<=len1-len2;i++){
            for(j=0;j<len2;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))break;
                if(j==len2-1)return i;
            }
        }
        return -1;
    }
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        for(int i=0;i<=len1-len2;i++){
            if(haystack.substring(i,len2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
