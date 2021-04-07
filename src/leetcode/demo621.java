package leetcode;

import java.util.HashMap;
import java.util.Map;

public class demo621 {
    public int leastInterval(char[] tasks, int n) {
        int[] temp =new int[26];
        int maxCount=0;
        for(char c:tasks){
            temp[c-'A']++;
            maxCount=Math.max(maxCount,temp[c-'A']);
        }
        int countMaxTask = 0;
        for(int i=0;i<26;i++){
            if(temp[i]==maxCount){
                countMaxTask++;
            }
        }
        return Math.max(tasks.length,(maxCount-1)*(n+1)+countMaxTask);
    }
}
