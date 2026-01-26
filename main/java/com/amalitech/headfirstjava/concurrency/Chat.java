package com.amalitech.headfirstjava.concurrency;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

final class Chat {
    private final String message;
    private final LocalDateTime timeStamp;

    public Chat(String message){
        this.message = message;
        timeStamp = LocalDateTime.now();
    }

    public String toString(){
        String time = timeStamp.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        return time + " " + message;
    }
}
