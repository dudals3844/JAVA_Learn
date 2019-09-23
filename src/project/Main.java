package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    static int i = 5;
    
    static void a(){
        int i = 0;//전역변수보다 지역변수가 우선이다. ㅑi = 0은 전역변수  int i = 0은 지역변수이다
        b();
    }
    
    static void b(){
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        a();
       

    }
}
