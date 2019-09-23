package project;

class DivisionableCalculator extends MultiplicationableCalculator{//상속에 상속을 했다.
    public void division() {
        System.out.println(this.left / this.right);
    }
}