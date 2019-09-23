package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DivisionableCalculator c1  = new DivisionableCalculator();
        //상속에 상속을 했다
        
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}
