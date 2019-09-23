package project;

class SubstractionableCalculator extends Calculator {
    
    public SubstractionableCalculator(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    public void substract(){
        System.out.println(this.left - this.right);
    }
}