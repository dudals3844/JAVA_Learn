package project;

import java.util.ArrayList;
import java.util.HashMap;

enum Fruit {
    APPLE, PEACH, BANANA;
    Fruit(){
        System.out.println("Call Constructor "+this);
    }
    
    // public Fruit(){//enum은 private만 지원해서 오류가 난다.
    //     System.out.println("Call Constructor "+this);
    // }
}


enum Company{
    GOOGLE, APPLE, ORACLE;
}

public class Main{
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}
