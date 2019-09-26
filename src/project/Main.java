package project;

import java.util.ArrayList;
import java.util.HashMap;

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit(String color){//APPLE("red")가 생성자를 호출한다 호출된 생성자는 Fruit(String color)이다
        System.out.println("Call Constructor "+this);
        this.color = color;
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
                System.out.println(57+" kcal: "+Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34+" kcal: "+Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93+" kcal: "+Fruit.BANANA.color);
                break;
        }
    }
}
