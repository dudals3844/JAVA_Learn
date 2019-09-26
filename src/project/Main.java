package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a);
    }
    
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, "+a.id);//b를 참조해서 a도 변경이 되었다.
    }
    
    
    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
