package ir.com.sample.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Object arg){
        for (Observer observer : observers) {
            observer.update(this,arg);
        }
    }

}
