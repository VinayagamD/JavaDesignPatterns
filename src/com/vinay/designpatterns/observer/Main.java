package com.vinay.designpatterns.observer;

import com.vinay.designpatterns.observer.interfaces.Observer;
import com.vinay.designpatterns.observer.model.EmailTopic;
import com.vinay.designpatterns.observer.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        // Create Observer
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        // Register Observer
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // Check for updates
        firstObserver.update();
        thirdObserver.update();


        // Provider / Subject (Broadcaster)
        topic.postMessage("Hello Subscribers");

        topic.unregister(firstObserver);
        topic.postMessage("Hello Subscribers");


    }
}
