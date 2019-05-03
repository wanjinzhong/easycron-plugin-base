package com.github.wanjinzhong.easycronbase.util;
import java.util.ArrayList;
import java.util.List;

import com.github.wanjinzhong.easycronbase.bo.SingleMessage;
import com.github.wanjinzhong.easycronbase.constant.LogLevel;
import com.github.wanjinzhong.easycronbase.service.EasyJobService;

public class EasyLogger {
    public static void log(LogLevel level, String message) {
        List<SingleMessage> messages = EasyJobService.messages.get();
        if (messages == null) {
            messages = new ArrayList<>();
        }
        messages.add(new SingleMessage(level, message));
        EasyJobService.messages.set(messages);
    }

    public static void debug(String message) {
        log(LogLevel.DEBUG, message);
    }
    public static void info(String message) {
        log(LogLevel.INFO, message);
    }
    public static void error(String message) {
        log(LogLevel.ERROR, message);
    }
    public static void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
}
