package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo146 {
    class LRUCache {
        int capacity=0;
        int cur=0;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        public LRUCache(int capacity) {
            this.capacity=capacity;
        }

        public int get(int key) {
            if(list1.contains(key)){
                int index=list1.indexOf(key);
                list1.remove(index);
                list1.add(key);
                int val=list2.get(index);
                list2.remove(index);
                list2.add(val);
                return val;
            }else{
                return -1;
            }
        }

        public void put(int key, int value) {
            if(list1.contains(key)){//是否存在
                int index=list1.indexOf(key);
                list1.remove(index);
                list1.add(key);
                list2.remove(index);
                list2.add(value);
            }else{//不存在
                if(cur<capacity){//容量
                    list1.add(key);
                    list2.add(value);
                    cur++;
                }else{
                    list1.remove(0);
                    list2.remove(0);
                    list1.add(key);
                    list2.add(value);
                }
            }

        }
    }
}

