package com.vinay.designpatterns.adapter.interfaces;

import com.vinay.designpatterns.adapter.models.Volt;

public interface SocketAdapter {
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();
    Volt get1Volt();
}
