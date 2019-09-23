package project;

import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    /**
     * @param args
     */
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        //c1.setOprands가 필요 없어졌다 public SubstractionableCalculator(int left, int right)에서 생성자로 left랑 right를 받았기 때문이다.
        c1.setOprands(10,20);
        System.out.println("평균 실행 결과는" + c1.avg());
        c1.sum();
        c1.substract();
    }
}
