package project;

import java.util.ArrayList;
import java.util.HashMap;


class C {
    int v = 10;
    
    
    void m(){
        int v  = 20;
        //v = this.v;
        System.out.println(this.v);
    }
}



public class Main{
    /**
     * @param args
     */
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        C c1 = new C();
        c1.m();
        
    }
}
