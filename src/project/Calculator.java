package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음




class Calculator {//interface구현으로 무조건 public으로 변경
    
    //public Calculator(){}//plus default constructor
    
    //int[] oprands;
    
    
    /*
    public Calculator(int left, int right){//생산자
        this.left = left;
        this.right = right;
    }
    */
    
    // public void setOprands(int[] oprands){
    //     this.oprands = oprands;
    // }
    int left, right;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
    
    
    
    
    
    // private int _sum(){
    //     return this.left + this.right;
    // }
    
    // public void sumDecoPlus(){
    //     System.out.println("++++++"+_sum()+"+++++++++");
    // }
    
    // public void sumDecoMinus(){
    //     System.out.println("---------"+_sum()+"--------");
    // }
    

}


