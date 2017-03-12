package com.example.observer;

import java.util.Observable;

public class WeatherStation {

    public static void main(String[] args) {
        // 自定义方式实现
        Subject weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        ((WeatherData) weatherData).setMeasurements(80, 65, 30.4f);

        // 利用jdk内置方式实现
        Observable weatherData2 = new WeatherData2();
        new CurrentConditionsDisplay2(weatherData2);
        ((WeatherData2) weatherData2).setMeasurements(80, 65, 30.4f);
    }

}
