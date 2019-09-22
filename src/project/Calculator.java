package project;// 파일 생성해도 package해줘야 된다 안하면 경로 못찾음

class Calculater {
    
    
    int left, right;//필드
    
    public void setOprands(int left, int right){//매개변수
        this.left = left;//this.left는 필드 left는 매개변수
        this.right = right;
    }
    
    
    public void sum(){
        System.out.println(this.left+this.right);
    }
    
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
    
    

}