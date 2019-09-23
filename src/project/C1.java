package project;

class C1{
    static int static_variable = 1;//클래스 변수
    int instance_variable = 2;//인스턴스 변수
    
    
    
    static void static_static(){//클래스 메소드가 클래스 변수 호출
        System.out.println(static_variable);
    }
    
    
    static void static_instance(){
        //클래스 메소드에서 인스턴스 변수에 접근 할 수 없다.
        //System.out.println(instance_variable);
    }
    
    
    //인스턴스 매소드는 static이 아니다.
    void instance_static(){
        System.out.println(static_variable);
    }
    
    
    void instance_instance(){
        System.out.println(instance_variable);
    }
}