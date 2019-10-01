package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */

    
    
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     Thread t = new Test(i);
        //     t.start();
        // }

        // System.out.println("main end.");
        
        //wait main util all thread end
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Test(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();//쓰레드가 종료될때 까지 대기
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println("main end");
    }
}
