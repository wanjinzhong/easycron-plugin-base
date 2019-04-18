package com.neil.easycron.plugin.service;
import java.io.InputStream;
import java.util.Map;

import com.neil.easycron.plugin.bo.JobRunningResult;

public interface EasyJobService {
    /**
     * Get input stream from the configuration file template
     *
     * @return input stream of the file template
     * @throws Exception exception
     */
    default InputStream getConfigFile() throws Exception {
        return this.getClass().getClassLoader().getResourceAsStream("config.xml");
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
    JobRunningResult serve(Map<String, Object> configData);

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
