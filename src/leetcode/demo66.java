package leetcode;

import org.junit.Test;

public class demo66 {
    @Test
    public void aa(){
//        String s="1";
//        int c=2;
//        s=c+s;
//        System.out.println(s);
        int[] d={9,9,9};
        plusOne(d);
    }
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        String s="";
        int count=1;
        for(int i=len-1;i>=0;i--){
            s=(digits[i]+count)%10+s;
            count=(digits[i]+count)/10;
        }
        if(count!=0)
            s=count+s;
        int[] nums=new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i]=s.charAt(i)-'0';
        }
        return nums;
    }
}
