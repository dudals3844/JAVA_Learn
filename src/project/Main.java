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
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        
        
        c1.setOprands(10,20,30);
        c1.sum();
        c1.avg();
    }
}
