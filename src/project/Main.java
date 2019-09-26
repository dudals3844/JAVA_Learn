package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
