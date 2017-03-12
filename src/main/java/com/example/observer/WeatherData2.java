package com.example.observer;

import java.util.Observable;

/**
 * 利用jdk内置方式实现
 * 
 * @author BIOHAZARD
 *
 */
public class WeatherData2 extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
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
