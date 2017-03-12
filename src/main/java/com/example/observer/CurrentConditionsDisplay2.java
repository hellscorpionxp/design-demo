package com.example.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay2 implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
