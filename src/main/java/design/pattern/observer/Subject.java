package design.pattern.observer;


public interface Subject {
    void notifyDisplay();
    void registerDisplay(ObserverDis o);
    void deleteDisplay(ObserverDis o);


}
