package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    public static void main(String[] args){
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();
        
        obj.A();
        obj.B();
        
        objI2.A();
        System.out.println(objI2.A());
        //objI2.B());// error
        
        //objI3.A();// error
        objI3.B();
        System.out.println(objI3.B());
    }
}
