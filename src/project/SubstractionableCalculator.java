package project;

class SubstractionableCalculator extends Calculator {
    
    //overriding
    public void sum(){
        System.out.println("실행결과는 " + (this.left + this.right) + "입니다.");    
    }
    
    //overriding
    public int avg() {
        return super.avg();
    }//error syntax
    // 메소드의 이름
    // 메소드 매개변수의 숫자와 데이터 타입 그리고 순서
    // 메소드의 리턴 타입
    
    public void substract(){
        System.out.println(this.left - this.right);
    }
}