package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

class Calculater {
    
    
    static double PI = 3.14;
    int left, right;
    
    public void setOprands(int left , int right){
        this.left = left;
        this.right = right;
    }
    
    public void sum(){
        System.out.println(this.left + this.right);
    }
    
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    

}