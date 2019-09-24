package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10,20);
        c1.run();
        
        
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10,20);
        c2.run();
    }
}
