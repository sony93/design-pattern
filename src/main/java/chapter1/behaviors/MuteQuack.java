package chapter1.behaviors;

import chapter1.interfaces.QuackBehavior;

/**
 * Created by sony on 18-1-22.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("Silence");
    }
}
