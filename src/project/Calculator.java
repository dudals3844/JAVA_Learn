package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

public class Calculator {//외부 패키지에서 접근 가능하게 public으로 변경
    
    //public Calculator(){}//plus default constructor
    
    int[] oprands;
    
    
    /*
    public Calculator(int left, int right){//생산자
        this.left = left;
        this.right = right;
    }
    */
    
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
    
    
    
    public void sum(){
        int total = 0;
        for(int value: this.oprands){
            total += value;
        }
        System.out.println(total);
    }
    
    public void avg(){
        int total = 0;
        for(int value: this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
    
    

}
