package com.vinay.designpatterns.adapter;

import com.vinay.designpatterns.adapter.interfaces.SocketAdapter;
import com.vinay.designpatterns.adapter.models.SocketAdapterImpl;
import com.vinay.designpatterns.adapter.models.SocketObjectAdaptorImpl;
import com.vinay.designpatterns.adapter.models.Volt;

public class Main {

    public static void main(String[] args) {
        testingObjectAdapter();
        testingClassAdapter();
    }

    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        createVolt(socketAdapter);
    }

    private static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdaptorImpl();
        createVolt(socketAdapter);
    }

    private static void createVolt(SocketAdapter socketAdapter) {
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);

        System.out.println("V3 volts is using Object Adapter "+v3.getVolts());
        System.out.println("V12 volts is using Object Adapter "+v12.getVolts());
        System.out.println("V120 volts is using Object Adapter "+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        switch (i){
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
