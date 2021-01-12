package leetcode;

import org.junit.Test;

public class demo008 {
    public int myAtoi(String s) {
        char[] charArray=s.toCharArray();
        int sign=1;
        int res=0,index=0;
        int len=charArray.length;
        if(index>=len)return 0;
        while(charArray[index]==' ')index++;//去掉前导空格
        if(charArray[index]=='-'){  //判断第一个字符
            sign=-1;index++;
        }else if(charArray[index]=='+'){
            sign=1;index++;
        }else if(charArray[index]>='0'&&charArray[index]<='9'){
            res=charArray[index]-'0';index++;
        }else return 0;
        while(index<len&&(charArray[index]>='0'&&charArray[index]<='9')){//后续
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (charArray[index] - '0') > Integer.MAX_VALUE % 10)) {
                return sign>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+(charArray[index]-'0');index++;
        }
        return res*sign;
    }
    @Test
    public void test(){
        System.out.println(myAtoi("wor 987"));
    }


}
