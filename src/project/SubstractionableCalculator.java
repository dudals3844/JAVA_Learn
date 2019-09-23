package project;

class SubstractionableCalculator extends Calculator {
    
    //overriding
    public void sum(){
        System.out.println("실행결과는 " + (this.left + this.right) + "입니다.");    
    }
    
    
    public void substract(){
        System.out.println(this.left - this.right);
    }
}