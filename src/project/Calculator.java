package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음




class Calculator implements Calculatable{//interface구현으로 무조건 public으로 변경
    
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
    int first, second, third;
    
    
    
    public void setOprands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public int sum(){
        return this.first + this.second + this.third;
    }
    
    public int avg(){
        return (this.first + this.second + this.third) / 3;
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


