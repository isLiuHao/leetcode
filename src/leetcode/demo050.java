package leetcode;

import org.junit.Test;

public class demo050 {
    public double myPow(double x, int n) {
        double sum=1.0;
        long b = n;
        if(b<0){
            x=1/x;
            b=-b;
        }
        while(b>0){ //n转化为二进制 x^n=x^(1b1)*x^(2b2)....x^(2^m-1 bm)
            if((b%2)==1) sum*=x; //判断二进制最后一位为几
            x*=x;
            b=b>>1;
        }
        return sum;
    }
    @Test
    public void test(){
        myPow(1.60835,-1);
    }
}
