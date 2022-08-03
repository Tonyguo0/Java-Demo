package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData extends WeatherStation implements Subject {
    private List<ObserverDis> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(WeatherStation w) {
        observers = new ArrayList<>();
        this.temp = w.temp;
        this.humidity = w.humidity;
        this.pressure = w.pressure;
    }


    public void measurementChanged() {
//        System.out.println("new temperature is :" + temp);
//        System.out.println("new humidity is :" + humidity);
//        System.out.println("new pressure is :" + pressure);
        notifyDisplay();

    }

    @Override
    public void notifyDisplay() {
        for (ObserverDis o : observers) {
            o.update(temp, pressure, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public void setMeasurements() {
        measurementChanged();
    }

    @Override
    public void registerDisplay(ObserverDis o) {
        observers.add(o);
    }

    @Override
    public void deleteDisplay(ObserverDis o) {
        observers.remove(o);
    }

}
