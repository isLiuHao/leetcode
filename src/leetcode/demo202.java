package leetcode;

import java.util.HashSet;
import java.util.Set;

public class demo202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            set.add(n);
            n=getNext(n);
            if(set.contains(n))return false;
        }
        return true;
    }
    public int getNext(int n){
        int result=0;
        while(n>0){
            int d=n%10;
            result=result+d*d;
            n=n/10;
        }
        return result;
    }
}
