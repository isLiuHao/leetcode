package leetcode;

import java.util.*;

public class demo347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer a:nums){
            if(map.containsKey(a)){
                map.replace(a,map.get(a)+1);
            }
            else map.put(a,1);
        }
        //小根堆 队列出队最小的 按照频率大的权重小
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {//频率从小到大排序   频率大的权重小
                return map.get(y) - map.get(x);
            }
        });
        for(Integer key:map.keySet()){
            queue.offer(key);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer a:nums){
            if(map.containsKey(a)){
                map.replace(a,map.get(a)+1);
            }
            else map.put(a,1);
        }
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            int max=0,maxi=0;
            for(Integer a:nums){
                if(max<map.get(a)){
                    max=map.get(a);
                    maxi=a;
                }
            }
            map.replace(maxi,0);
            res[i]=maxi;
        }
        return res;
    }
}
