package leetcode;

public class demo67 {
    public String addBinary(String a, String b) {
        String s="";
        int count=0;
        int i,j;
        for(i=a.length()-1,j=b.length()-1;;j--,i--){
            if(i>=0&&j>=0){
                s=(a.charAt(i)-'0'+b.charAt(j)-'0'+count)%2+s;
                count=(a.charAt(i)-'0'+b.charAt(j)-'0')/2;
            }
            else if(i>=0){
                s=(a.charAt(i)-'0'+count)%2+s;
                count=(a.charAt(i)-'0')/2;
            }else if(j>=0){
                s=(b.charAt(j)-'0'+count)%2+s;
                count=(b.charAt(j)-'0')/2;
            }else break;
        }
        if(count!=0)s=count+s;
        return s;
    }
}
