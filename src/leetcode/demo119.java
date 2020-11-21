package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list1=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    list1.add(1);
                }else {
                    Integer x=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    list1.add(x);
                }
            }
            list.add(list1);
        }
        List<Integer> list2=new ArrayList<>();
        for(int j=0;j<=rowIndex;j++){
            list2.add(list.get(rowIndex).get(j));
        }
        return list2;
    }
}
