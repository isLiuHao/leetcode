package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo438 {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length(), m=p.length();
        List<Integer> res = new ArrayList<>();
        if(n<m) return res;
        int[] pCnt = new int[26];
        int[] sCnt = new int[26];
        for(int i = 0; i < m; i++){
            pCnt[p.charAt(i)-'a']++;
            sCnt[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sCnt, pCnt)){
            res.add(0);
        }
        for(int i=m;i<n;i++) {
            sCnt[s.charAt(i - m) - 'a']--;
            sCnt[s.charAt(i) - 'a']++;
            if (Arrays.equals(sCnt, pCnt)) {
                res.add(i - m + 1);
            }
        }
        return res;
    }
    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int count=p.length();
        int[] map=new int[26];
        for(int i=0;i<p.length();i++){
            map[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-count;i++){
            boolean flag=true;
            int[] newmap= map.clone();
            for(int j=i;j<i+count;j++){
                if(newmap[s.charAt(j)-'a']==0){
                    flag=false;
                    break;
                }else
                    newmap[s.charAt(j)-'a']--;
            }
            for(int j=0;j<26;j++){
                if(newmap[j]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                res.add(i);
            }
        }
        return res;
    }
}
