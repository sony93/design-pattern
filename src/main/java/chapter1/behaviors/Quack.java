package chapter1.behaviors;

import chapter1.interfaces.QuackBehavior;

/**
 * Created by sony on 18-1-22.
 */
public class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack");
    }
}
