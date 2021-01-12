package leetcode;

import org.junit.Test;

public class demo005 {
    public String longestPalindrome1(String s) {
        if(s.length()<2)return s;
        int max=1;String res=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(max<(j-i+1)&&isP(s,i,j)){
                    max=j-i+1;
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
    public boolean isP(String str,int left,int right){
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s){
        if(s.length()<2)return s;
        boolean[][] arr=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
            arr[i][i]=true;
        int maxlen=1,start=0;
        for(int j=1;j<s.length();j++){//先升序填列
            for(int i=0;i<j;i++){
                if(s.charAt(i)!=s.charAt(j))
                    arr[i][j]=false;
                else{
                    if(j-i<3)//(j-1)-(i+1)+1<2
                        arr[i][j]=true;
                    else
                        arr[i][j]=arr[i+1][j-1];
                }
                if(arr[i][j]&&j-i+1>maxlen){
                    maxlen=j-i+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }

    @Test
    public void t(){
        System.out.println(longestPalindrome("cbbd"));
    }
}
