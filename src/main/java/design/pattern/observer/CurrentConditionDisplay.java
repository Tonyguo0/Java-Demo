package design.pattern.observer;

public class CurrentConditionDisplay implements ObserverDis {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherdata;

    public CurrentConditionDisplay(WeatherData weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerDisplay(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition is: " + temp + " C degrees and " + humidity + "% humidity and " + pressure + "Kpa pressure.");
    }
}
