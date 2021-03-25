package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class demo210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();//邻接表存储
        int[] indegree=new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] res=new int[numCourses];int k=0;
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] cp:prerequisites){
            list.get(cp[1]).add(cp[0]);
            indegree[cp[0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int i=queue.poll();
            numCourses--;
            res[k++]=i;
            for(int x:list.get(i)){
                indegree[x]--;
                if(indegree[x]==0)
                    queue.add(x);
            }
        }
        if(numCourses==0)return res;
        else return new int[0];
    }
}
