package com.neil.easycron.plugin.bo;
import java.util.Calendar;

public class SingleMessage {
    private Calendar time;
    private String message;

    public SingleMessage() {
    }

    public SingleMessage(Calendar time, String message) {
        this.time = time;
        this.message = message;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return time.toString() + "  " + message;
    }
}
