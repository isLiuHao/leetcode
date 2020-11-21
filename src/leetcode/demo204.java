package leetcode;

import java.util.Arrays;

public class demo204 {
    public int countPrimes(int n) {
        int count=0;
        boolean[] isPrimes=new boolean[n];
        Arrays.fill(isPrimes,true);
        for(int i=2;i*i<n;i++){
            if(isPrimes[i]){
                for(int j=2*i;j<n;j+=i){
                    isPrimes[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(isPrimes[i])count++;
        }
        return count;
    }

}
