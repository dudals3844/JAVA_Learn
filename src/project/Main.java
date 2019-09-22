package project;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    /**
     * @param args
     */
    public static String[] getMembers(){
        String[] members = {"choi", "young", "min"};
        return members;
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] members = getMembers();
        for(int i =0 ; i < members.length; i++){
            System.out.print(members[i]);
        }
        
        
    }

}
