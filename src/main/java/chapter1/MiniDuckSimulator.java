package chapter1;

import chapter1.behaviors.FlayRocketPowered;

/**
 * Created by sony on 18-1-22.
 */


public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlayRocketPowered());
        model.performFly();
    }
}
