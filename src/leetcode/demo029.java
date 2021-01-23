package leetcode;

public class demo029 {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        int result=0;
        int f1=1,f2=1;
        if(dividend>0){
            f1=-1;dividend=-dividend;
        }
        if(divisor>0){
            f2=-1;divisor=-divisor;
        }
        while(dividend<=divisor){
            int temp=divisor;
            int c=1;
            while(dividend-temp<=temp){
                temp=temp<<1;
                c=c<<1;
            }
            dividend-=temp;
            result=result+c;
        }
        return result*f1*f2;
    }
}
