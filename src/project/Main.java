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
        c1.setOprands(10,20);
        c1.sum();
        
        Calculater c2 = new Calculater();
        c2.setOprands(20,40);
        c2.sum();
        
        
        Calculater.base = 10;//클래스 변수의 값을 10으로 설정
        
        c1.sum();
        
        c2.sum();
        
        
        C1 c = new C1();//c 인스턴스 생성
        
        
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패 인스턴스를 생성도 안했는데 인스턴스에 접근하라하면 당연히 오류가 난다.
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
        
        
        
       

    }
}
