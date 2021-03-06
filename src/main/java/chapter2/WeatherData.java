package chapter2;

import java.util.Observable;

/**
 * Created by sony on 18-1-23.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged() {
        //来开启状态通知
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }


    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
