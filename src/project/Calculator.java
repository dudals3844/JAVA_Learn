package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

class Calculator {
    
    //public Calculator(){}//plus default constructor
    
    int left, right;
    
    
    /*
    public Calculator(int left, int right){//생산자
        this.left = left;
        this.right = right;
    }
    */
    
    public void setOprands(int left , int right){
        this.left = left;
        this.right = right;
    }
    
    
    public void sum(){
        System.out.println(this.left + this.right);
    }
    
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
    
    

}
