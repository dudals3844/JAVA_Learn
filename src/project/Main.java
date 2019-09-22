package project;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    /**
     * @param args
     */
    public static String numbering(int init,int limit){ //static은 정적 자료이고 String은 리턴을 String으로 한다는 의미
        int i = init;
        
        String output = "";//숫자들을 아웃풋에 담는다. 
        while(i < limit){
            //System.out.println(i);
            output += i;
            i++;
        }
        
        return output;//public static String 이므로 String을 리턴한다.
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //numbering();
        String result = numbering(1,5);
        System.out.println(result);
        
        
        
    }

}
