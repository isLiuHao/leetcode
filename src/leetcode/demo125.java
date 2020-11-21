package leetcode;

public class demo125 {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i)))i++;
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j)))j--;
            if(i<j){
                if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                    i++;j--;
                }
                else return false;
            }
        }
        return true;
    }
}
