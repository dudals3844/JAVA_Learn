package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
   public static void execute(Calculator cal){
       System.out.println("result");
       cal.run();
   }
    
    public static void main(String[] args){
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        //c1.run();
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        //c2.run(); 
        
        execute(c1);//Calculator cal = new CalfulatorDecoPlus
        execute(c2);//Calculator cal = new CalfulatorDecoMinus
    }
}
