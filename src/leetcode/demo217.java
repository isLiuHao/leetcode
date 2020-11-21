package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num))return false;
        }
        return true;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&(i-map.get(nums[i]))<=k){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
