package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
    
    
    public static void main(String[] args) {
        SingleThread ct = new SingleThread();
        Thread t = new Thread(ct,"first");
        t.start();
        
        // SingleThread ct1 = new SingleThread();
        // Thread t1 = new Thread(ct1,"first");
        // t1.start();
        
        // SingleThread ct2 = new SingleThread();
        // Thread t2 = new Thread(ct2,"first");
        // t2.start();
        
        
        System.out.println("main Thread exit");
        
        //System.exit(0);
    }
}
