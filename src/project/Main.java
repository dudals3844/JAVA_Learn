package project;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String, String> map = new HashMap<String , String>();
        map.put("people", "human");
        map.put("baseball","야구");
        
        
        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        
        
    }

}
