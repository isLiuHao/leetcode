package leetcode;

import org.junit.Test;

public class demo043 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int len1=num1.length();
        int len2=num2.length();
        int[] ansArr = new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            int x=num1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int y=num2.charAt(j)-'0';
                ansArr[i+j+1]+=x*y;
            }
        }
        for(int m=len1+len2-1;m>0;m--){
            ansArr[m-1]+=ansArr[m]/10;
            ansArr[m]=ansArr[m]%10;
        }
        int index=ansArr[0]==0?1:0;
        StringBuffer str=new StringBuffer();
        while(index<len1+len2){
            str.append(ansArr[index]);
            index++;
        }
        return str.toString();
    }
    @Test
    public void test(){
        String num3="2";
        num3+=1;
        System.out.println(num3);
    }
}
