package project;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    /**
     * @param args
     */
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] temp = {"aa","bb","cc"};
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
        
        System.out.println("--------SAME SYNTAX---------");
        
        for(String el : temp){
            System.out.println(el);//배열 하나를 출력하고 다시 FOR문으로 반복한다.
        }
        
    }

}
