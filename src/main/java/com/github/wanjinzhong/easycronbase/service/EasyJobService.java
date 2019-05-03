package com.github.wanjinzhong.easycronbase.service;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.github.wanjinzhong.easycronbase.bo.SingleMessage;
import com.github.wanjinzhong.easycronbase.constant.JobRunningStatus;
import com.github.wanjinzhong.easycronbase.util.EasyLogger;
import com.github.wanjinzhong.easycronbase.bo.JobRunningResult;

public interface EasyJobService {
    ThreadLocal<List<SingleMessage>> messages =  new ThreadLocal<>();
    /**
     * Get input stream from the configuration file template
     *
     * @return input stream of the file template
     * @throws Exception exception
     */
    default InputStream getConfigFile() throws Exception {
        return getConfigFile("config.xml");
    }
    default InputStream getConfigFile(String fileName) throws Exception {
        return this.getClass().getClassLoader().getResourceAsStream(fileName);
    }

    /**
     * Validate configuration file
     * @param configData config data
     * @return error
     */
    Map<String/*config item name*/, String /*error*/> validateConfigFile(Map<String, Object> configData);

    /**
     * serve
     *
     * @return result
     */
    JobRunningStatus serve(Map<String, Object> configData);

    /**
     * call with log
     *
     * @return result
     */
    default JobRunningResult call(Map<String, Object> configData){
        JobRunningStatus result;
        try {
            result = serve(configData);
        } catch (Exception e) {
            result = JobRunningStatus.FAILED;
            StringBuilder builder = new StringBuilder();
            builder.append(e.getClass().getName()).append(": ").append(e.getMessage()).append("\r\n");
            for (StackTraceElement element : e.getStackTrace()) {
                builder.append("\t").append(element).append("\r\n");
            }
            EasyLogger.fatal(builder.toString());
        }
        JobRunningResult runningResult = new JobRunningResult();
        runningResult.setRunningStatus(result);
        runningResult.setMessage(messages.get());
        messages.remove();
        return runningResult;
    }

    /**
     * test
     *
     * @return result
     */
    JobRunningResult test(Map<String, Object> configData);

    /**
     * Get version of this plugin
     *
     * @return version
     */
    String getVersion();
}
