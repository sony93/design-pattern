package chapter1.behaviors;

import chapter1.interfaces.FlyBehavior;

/**
 * Created by sony on 18-1-22.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("can not fly");
    }
}
