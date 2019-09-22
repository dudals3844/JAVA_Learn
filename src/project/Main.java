package project;

import java.util.ArrayList;
import java.util.HashMap;

/*
class Calculater {
    
    
    int left, right;//필드
    
    public void setOprands(int left, int right){//매개변수
        this.left = left;//this.left는 필드 left는 매개변수
        this.right = right;
    }
    
    
    public void sum(){
        System.out.println(this.left+this.right);
    }
    
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
    
    

}
*/

public class Main{
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Calculater c1 = new Calculater();
        System.out.println(c1.PI);//인스턴스를 이용해 PI 접근
        
        Calculater c2 = new Calculater();
        System.out.println(c2.PI);
        
        
        System.out.println(Calculater.PI);//클래스를 통해서 PI 접근
        
        
        
        
       

    }
}
