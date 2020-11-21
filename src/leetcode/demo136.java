package leetcode;
import java.util.HashMap;
import java.util.Map;
public class demo136 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer i:nums) {
            Integer count=map.get(i);
            count=count==null?1:++count;
            map.put(i,count);
        }
        for (Integer i:nums) {
            if(map.get(i)==1)
                return i;
        }
        return -1;
    }
}
