package leetcode;

public class demo461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count=0;
        while(xor!=0){
            count++;
            xor=xor&(xor-1);//最右侧的1变为0
        }
        return count;
    }
}
