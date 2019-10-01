package project;

public class Test extends Thread {
    int seq;
    public Test(int seq){
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq+"Thread start");
        try{
            Thread.sleep(1000);

        }catch (Exception e){

        }
        System.out.println(this.seq+"Thread end.");
    }
}