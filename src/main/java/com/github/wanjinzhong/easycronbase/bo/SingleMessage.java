package com.github.wanjinzhong.easycronbase.bo;
import java.util.Calendar;

import com.github.wanjinzhong.easycronbase.constant.LogLevel;

public class SingleMessage {
    private Calendar time;
    private LogLevel level;
    private String message;

    public SingleMessage(LogLevel level, String message) {
        this.time = Calendar.getInstance();
        this.level = level;
        this.message = message;
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public Calendar getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
