package design.pattern.observer;

public class WeatherStation {
    protected float temp;
    protected float humidity;
    protected float pressure;

    public WeatherStation() {
        temp = 32.2f;
        humidity = 50f;
        pressure = 100f;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
