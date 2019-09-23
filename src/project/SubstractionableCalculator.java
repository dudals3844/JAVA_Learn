package project;

class SubstractionableCalculator extends Calculator {
    
    public SubstractionableCalculator(int left, int right){
        super(left,right);//super는 상위 클래스를 가르키는 키워드이다.
    }
    
    public void substract(){
        System.out.println(this.left - this.right);
    }
}