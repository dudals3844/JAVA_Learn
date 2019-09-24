package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

public class Calculator {//외부 패키지에서 접근 가능하게 public으로 변경
    
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
    
    private int left, right;
    
    
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    private int _sum(){
        return this.left + this.right;
    }
    
    public void sumDecoPlus(){
        System.out.println("++++++"+_sum()+"+++++++++");
    }
    
    public void sumDecoMinus(){
        System.out.println("---------"+_sum()+"--------");
    }
    

}
