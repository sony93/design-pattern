package chapter2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sony on 18-1-23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;

    private float humidity;

    //登记观察者
    public CurrentConditionsDisplay(Observable observable){
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
