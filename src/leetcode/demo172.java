package leetcode;

import org.junit.Test;

public class demo172 {

    @Test
    public void ss(){
        System.out.println(trailingZeroes(15));
    }
    public int trailingZeroes(int n) {
        int count=0;int a;
        for(int i=1;i<=n;i++){
            a=i;
            while(a%5==0){
                count++;
                a=a/5;
            }
        }
        return count;
    }

}
