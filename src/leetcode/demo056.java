package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class demo056 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            int len = intervals.length;
            if(len==0)return new int[0][2];
            Arrays.sort(intervals,new Comparator<int[]>(){
                public int compare(int[] intervals1,int[] intervals2){
                    return intervals1[0]-intervals2[0];
                }
            });
            List<int[]> res = new ArrayList<>();
            for(int i=0;i<len;i++){
                int L=intervals[i][0],R=intervals[i][1];
                if(res.size()==0||L>res.get(res.size()-1)[1]){
                    res.add(new int[]{L,R});
                }else{
                    res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],R);
                }
            }
            return res.toArray(new int[0][]);
        }
    }
}
