package leetcode;

public class demo014 {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len<1)return "";
        int min=Integer.MAX_VALUE;
        for(int j=0;j<len;j++){
            min=Math.min(strs[j].length(),min);
        }
        String ss="";
        for(int i=0;i<min;i++){     //最短位长
            char x=strs[0].charAt(i);
            boolean flag=true;
            for(int j=1;j<len;j++){ //每一个
                if(strs[j].charAt(i)!=x)
                    flag=false;
            }
            if (flag==false)return ss;
            else
                ss+=x;
        }
        return ss;
    }
}
