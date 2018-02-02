package chapter2;

/**
 * Created by sony on 18-1-23.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 234, 20.4f);
        weatherData.setMeasurements(56, 232, 20.4f);
        weatherData.setMeasurements(34, 123, 20.4f);

    }
}
