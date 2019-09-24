package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator c1 = new Calculator();
        c1.setOprands(new int[]{10,20});//int[] oprands = new int[]{20,30} 밑에 예시 있다.
        c1.sum();
        c1.avg();
        
        
        c1.setOprands(new int[]{10,20,30});
        c1.sum();
        c1.avg();
        /*
        int[] array = new int[]{1,2,3,4,5};
        
        for(int i = 0 ; i < 5 ;i++){
            System.out.println(array[i]);
        }
        */
    }
}
