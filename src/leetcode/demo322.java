package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class demo322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count=0;
        for(int i=coins.length-1;i>=0;i--){
            while(amount>=coins[i]){
                count++;
                amount-=coins[i];
            }
        }
        return amount==0?count:-1;
    }
    @Test
    public void test(){
        int[] a=new int[]{186,419,83,408};
        coinChange(a,6249);
    }
}
