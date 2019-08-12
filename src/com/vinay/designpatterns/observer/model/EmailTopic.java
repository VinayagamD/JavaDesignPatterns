package com.vinay.designpatterns.observer.model;

import com.vinay.designpatterns.observer.interfaces.Observer;
import com.vinay.designpatterns.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers;

    private String message;

    public EmailTopic() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/Observer");
        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message){
        System.out.println("Message posted to my topic : "+ message);
        this.message = message;
        notifyObservers();
    }
}
