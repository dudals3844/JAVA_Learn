package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

class Calculator {
    
    //public Calculator(){}//plus default constructor
    
    int left, right;
    int third = 0;
    
    
    /*
    public Calculator(int left, int right){//생산자
        this.left = left;
        this.right = right;
    }
    */
    
    public void setOprands(int left , int right){
        System.out.println("setOprands(int left , int right)");
        this.left = left;
        this.right = right;
    }
    
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left , int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
    
    
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
    
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
    
    

}
