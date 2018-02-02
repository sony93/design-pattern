package chapter1;

import chapter1.behaviors.FlyNoWay;
import chapter1.behaviors.Quack;

/**
 * Created by sony on 18-1-22.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("model duck");
    }
}
