package project;


public class SingleThread implements Runnable {
    private int[] temp;
    
    public SingleThread(){
        temp = new int[10];
        for(int start = 0; start < temp.length; start++){
            temp[start] = start;
        }
    }
    
    @Override
    public void run(){
        for(int start: temp){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
            
            System.out.println("Thread name: "+Thread.currentThread().getName());
            System.out.println("temp value: "+start);
        }
    }
}