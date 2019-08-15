package com.vinay.designpatterns.singleton;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * Create Singleton Instance with double check locking
     * @see com.vinay.designpatterns.singleton.Singleton
     * @return com.vinay.designpatterns.singleton.Singleton
     */
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized ((Singleton.class)){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return null;
    }
}
