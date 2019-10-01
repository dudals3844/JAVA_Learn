package project;

public class Test implements Runnable {
    int seq;
    public Test(int seq){
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq+"Thread start");
        try{
            Thread.sleep(1000);

        }catch (Exception e){

        }
        System.out.println(this.seq+"Thread end.");
    }
}