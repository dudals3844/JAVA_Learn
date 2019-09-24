package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator c = new Calculator();
        c.setOprands(10,20,30);
        System.out.println(c.sum() + c.avg());
    }
}
