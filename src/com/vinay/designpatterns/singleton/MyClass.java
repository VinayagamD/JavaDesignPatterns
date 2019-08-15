package com.vinay.designpatterns.singleton;

public class MyClass {

    private static MyClass uniqueInstance;
    String name;

    private MyClass() {
    }

    public static synchronized MyClass getInstance(){
        // Adding the synchronized keyword makes our singleton thread safe.
       if(uniqueInstance == null){
           uniqueInstance = new MyClass();
       }
        return uniqueInstance;
    }
}
