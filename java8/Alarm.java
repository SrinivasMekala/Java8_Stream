package com.srini.java8;

public interface Alarm {
	
	default String turnAlarmOn() {
        return "Alarm : Turning the alarm on.";
    }
     
    default String turnAlarmOff() {
        return "Alarm : Turning the alarm off.";
    }
    
}
