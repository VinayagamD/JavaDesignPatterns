package com.vinay.designpatterns.observer.model;

import com.vinay.designpatterns.observer.interfaces.Observer;
import com.vinay.designpatterns.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;

    // Reference to our Subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null)
            System.out.println(name + " No new message on this topic!");
        else
            System.out.println(name + " Retrieving message: "+message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
