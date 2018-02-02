package chapter1;

import chapter1.behaviors.FlayWithWings;
import chapter1.behaviors.Quack;

/**
 * Created by sony on 18-1-22.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlayWithWings();
    }

    public void display(){
        System.out.println("mallard chapter1.Duck");
    }
}
