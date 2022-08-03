package design.pattern.observer;

public class ObserverMain {


    public static void main(String[] args){
//        WeatherStation weather = new WeatherStation();
        WeatherData weatherdata = new WeatherData(new WeatherStation());
        CurrentConditionDisplay currentconditiondisplay = new CurrentConditionDisplay(weatherdata);
        weatherdata.setMeasurements();
//        currentconditiondisplay.display();
    }

}
